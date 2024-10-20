package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.rcs.client.messaging.data.ContentType;
import defpackage.aoad;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupManagementContentType {
    public static final String CONTENT_TYPE = "application/vnd.oma.cpm-groupdata+xml";
    public static final ContentType CPM_GROUP_DATA_CONTENT_TYPE;

    static {
        aoad g = ContentType.g();
        g.C("application");
        g.B("vnd.oma.cpm-groupdata+xml");
        CPM_GROUP_DATA_CONTENT_TYPE = g.y();
    }

    private GroupManagementContentType() {
    }
}
