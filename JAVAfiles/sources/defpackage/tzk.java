package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzk {
    public static final tzk a;
    public static final tzk b;
    public static final tzk c;
    private static final /* synthetic */ tzk[] d;

    static {
        tzk tzkVar = new tzk("ONE_ON_ONE_TEXT", 0);
        a = tzkVar;
        tzk tzkVar2 = new tzk("ONE_ON_ONE_RCS", 1);
        b = tzkVar2;
        tzk tzkVar3 = new tzk("ONE_ON_ONE_E2EE", 2);
        c = tzkVar3;
        tzk[] tzkVarArr = {tzkVar, tzkVar2, tzkVar3};
        d = tzkVarArr;
        arhi.f(tzkVarArr);
    }

    private tzk(String str, int i) {
    }

    public static final tzk a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (messageCoreData.cI() && messageCoreData.cn()) {
            return c;
        }
        if (messageCoreData.cI()) {
            return b;
        }
        return a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tzk b(int r3) {
        /*
            r0 = 219(0xdb, float:3.07E-43)
            if (r3 == r0) goto L1e
            switch(r3) {
                case 214: goto L1b;
                case 215: goto L18;
                case 216: goto L1e;
                default: goto L7;
            }
        L7:
            switch(r3) {
                case 235: goto L1e;
                case 236: goto L1b;
                case 237: goto L1e;
                case 238: goto L18;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported status("
            java.lang.String r2 = ")"
            java.lang.String r3 = defpackage.a.cb(r3, r1, r2)
            r0.<init>(r3)
            throw r0
        L18:
            tzk r3 = defpackage.tzk.b
            goto L20
        L1b:
            tzk r3 = defpackage.tzk.a
            goto L20
        L1e:
            tzk r3 = defpackage.tzk.c
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzk.b(int):tzk");
    }

    public static tzk[] values() {
        return (tzk[]) d.clone();
    }
}
