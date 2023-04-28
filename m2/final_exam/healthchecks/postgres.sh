#!/bin/bash
set -eo pipefail

host="$(hostname -i || echo '127.0.0.1')"
user="${POSTGRES_USER:-admin}"
db="${POSTGRES_DB:-postgres}"
export PGPASSWORD="${POSTGRES_PASSWORD:-admin1234}"

args=(
	# force postgres to not use the local unix socket (test "external" connectibility)
	--host "$host"
	--username "$user"
	--dbname "$db"
	--quiet --no-align --tuples-only
)

if select="$(echo 'SELECT 1' | psql "${args[@]}")" && [ "$select" = '1' ]; then
	exit 0
fi

exit 1
