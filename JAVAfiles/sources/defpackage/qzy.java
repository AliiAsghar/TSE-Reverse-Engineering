package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qzy implements alhr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ qzy(InitiateClientSideFallbackAction initiateClientSideFallbackAction, MessageCoreData messageCoreData, int i, MessageIdType messageIdType, tqf tqfVar, int i2) {
        this.f = i2;
        this.b = initiateClientSideFallbackAction;
        this.c = messageCoreData;
        this.a = i;
        this.d = messageIdType;
        this.e = tqfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r6.moveToFirst() != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd A[Catch: gl -> 0x0130, TryCatch #4 {gl -> 0x0130, blocks: (B:34:0x0076, B:41:0x00b8, B:27:0x00dd, B:29:0x00e4, B:30:0x00f4, B:67:0x00cb, B:66:0x00c8, B:25:0x00cc, B:36:0x0087, B:40:0x00b5, B:57:0x00b1, B:56:0x00ae, B:45:0x009f, B:51:0x00a8, B:61:0x00c2), top: B:33:0x0076, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzy.get():java.lang.Object");
    }

    public /* synthetic */ qzy(ljp ljpVar, Context context, enh enhVar, ConversationIdType conversationIdType, int i, int i2) {
        this.f = i2;
        this.d = ljpVar;
        this.b = context;
        this.c = enhVar;
        this.e = conversationIdType;
        this.a = i;
    }

    public /* synthetic */ qzy(urr urrVar, String str, String str2, upx upxVar, int i, int i2) {
        this.f = i2;
        this.c = urrVar;
        this.d = str;
        this.e = str2;
        this.b = upxVar;
        this.a = i;
    }

    public /* synthetic */ qzy(urr urrVar, upx upxVar, String str, String str2, int i, int i2) {
        this.f = i2;
        this.c = urrVar;
        this.b = upxVar;
        this.d = str;
        this.e = str2;
        this.a = i;
    }

    public /* synthetic */ qzy(vqp vqpVar, MessageCoreData messageCoreData, Uri uri, String str, int i, int i2) {
        this.f = i2;
        this.d = vqpVar;
        this.c = messageCoreData;
        this.b = uri;
        this.e = str;
        this.a = i;
    }
}
