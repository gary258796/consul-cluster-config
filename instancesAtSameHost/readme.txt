使用以下指令，在本機啟動三個 Consul Server Agent.

consul agent -bind 127.0.0.1 --config-file server1.json
consul agent -bind 127.0.0.1 --config-file server2.json
consul agent -bind 127.0.0.1 --config-file server3.json