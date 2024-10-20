package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class GroupManagementRequestOrResponse {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Kind {
        REQUEST,
        RESPONSE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GroupManagementRequestOrResponse ofRequest(GroupManagementRequest groupManagementRequest) {
        return AutoOneOf_GroupManagementRequestOrResponse.request(groupManagementRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GroupManagementRequestOrResponse ofResponse(GroupManagementResponse groupManagementResponse) {
        return AutoOneOf_GroupManagementRequestOrResponse.response(groupManagementResponse);
    }

    public abstract Kind getKind();

    public abstract GroupManagementRequest request();

    public abstract GroupManagementResponse response();
}
