package defpackage;

import android.database.Cursor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acqe implements Runnable {
    final /* synthetic */ acqi b;

    public acqe(acqi acqiVar) {
        this.b = acqiVar;
    }

    protected abstract int a();

    protected abstract Cursor b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.b.j(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[Catch: all -> 0x0093, TryCatch #3 {all -> 0x0093, blocks: (B:17:0x006f, B:19:0x0073, B:22:0x007b, B:24:0x008a, B:26:0x0096, B:27:0x009b, B:29:0x00a2, B:31:0x00a6, B:33:0x00b7, B:36:0x00bc, B:37:0x00be, B:51:0x00ff, B:53:0x0103, B:55:0x010b, B:58:0x013f, B:59:0x0142, B:61:0x0148, B:63:0x0151, B:68:0x0113, B:73:0x011a, B:77:0x011e, B:75:0x0128, B:81:0x0154, B:93:0x00f2, B:94:0x00f3, B:96:0x016d, B:98:0x0174, B:99:0x01ab, B:101:0x01b6, B:102:0x01be, B:104:0x01c9, B:106:0x01d1, B:107:0x01e4, B:109:0x01ee, B:110:0x01f4, B:111:0x020f, B:112:0x017c, B:113:0x0181, B:115:0x018b, B:135:0x018f, B:118:0x0197, B:119:0x0199, B:130:0x01a3, B:136:0x01a4, B:139:0x0223, B:39:0x00bf, B:42:0x00cb, B:87:0x00df, B:88:0x00ee, B:43:0x00d0, B:46:0x00d4, B:47:0x00dd), top: B:16:0x006f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqe.run():void");
    }
}
