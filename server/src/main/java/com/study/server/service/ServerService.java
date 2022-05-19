package com.study.server.service;

import java.util.Collection;

import com.study.server.model.Server;

public interface ServerService {
    Server create(Server server);
    Collection<Server>list(int Limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
