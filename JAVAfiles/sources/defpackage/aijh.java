package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aijh {
    AUDIO("audio"),
    VIDEO("video"),
    APPLICATION("application"),
    DATA(GroupManagementRequest.DATA_TAG),
    MESSAGE("message");

    public final String f;

    aijh(String str) {
        this.f = str;
    }
}
