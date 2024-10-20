package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muu {
    public final mtg a;
    public final armf b;
    public final Context c;
    public final armf d;
    public final boolean e;
    public final armf f;
    private final alor g;
    private final mtc h;
    private final Optional i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final myj n;

    public muu(Context context, mtg mtgVar, armf armfVar, myj myjVar, alor alorVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, boolean z, mtc mtcVar, Optional optional) {
        this.c = context;
        this.a = mtgVar;
        this.b = armfVar;
        this.n = myjVar;
        this.g = alorVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.d = armfVar4;
        this.l = armfVar5;
        this.f = armfVar6;
        this.m = armfVar7;
        this.e = z;
        this.h = mtcVar;
        this.i = optional;
    }

    public final miz a(MessagesTable.BindData bindData, ConversationId conversationId, int i) {
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.A(), -1L);
        muq muqVar = muq.a;
        mxy mxyVar = new mxy(i);
        mzx mzxVar = mzx.a;
        int i2 = alog.d;
        return this.a.a(coreBugleMessageId, conversationId, bindData, muqVar, mxyVar, mzxVar, null, false, alsx.a, new msl(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x022e, code lost:
    
        if (r6 == r7) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog b(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r29, defpackage.alog r30, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r31, defpackage.ifs r32, defpackage.alor r33, defpackage.mzx r34, defpackage.mll r35) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muu.b(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, alog, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, ifs, alor, mzx, mll):alog");
    }
}
