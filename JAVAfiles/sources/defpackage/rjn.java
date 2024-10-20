package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjn {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final Object d;
    public final Object e;

    public rjn(Context context, String str, gke gkeVar, boolean z, boolean z2) {
        this.d = context;
        this.c = str;
        this.e = gkeVar;
        this.b = z;
        this.a = z2;
    }

    public rjn(ConversationIdType conversationIdType, String str, boolean z, boolean z2, String str2) {
        this.d = conversationIdType;
        this.e = str;
        this.a = z;
        this.b = z2;
        this.c = str2;
    }
}
