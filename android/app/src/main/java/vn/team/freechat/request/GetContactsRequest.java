package vn.team.freechat.request;

import com.tvd12.ezyfoxserver.client.entity.EzyData;
import com.tvd12.ezyfoxserver.client.factory.EzyEntityFactory;
import com.tvd12.ezyfoxserver.client.request.EzyRequest;

import vn.team.freechat.contant.Commands;

/**
 * Created by tavandung12 on 10/3/18.
 */

public class GetContactsRequest implements EzyRequest {

    private final int skip;
    private final int limit;

    public GetContactsRequest(int skip, int limit) {
        this.skip = skip;
        this.limit = limit;
    }

    @Override
    public EzyData serialize() {
        return EzyEntityFactory.newObjectBuilder()
                .append("skip", skip)
                .append("limit", limit)
                .build();
    }

    @Override
    public Object getCommand() {
        return Commands.CHAT_GET_CONTACTS;
    }
}
