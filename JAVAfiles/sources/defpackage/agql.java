package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agql implements hse {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("FifeModelLoader");
    private final hse c;
    private final hgi d;

    static {
        new hni("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, new hnh() { // from class: agqk
            @Override // defpackage.hnh
            public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
                int i = agql.a;
                if (((Boolean) obj).booleanValue()) {
                    messageDigest.update(bArr);
                }
            }
        });
    }

    public agql(hse hseVar) {
        new andj();
        this.c = hseVar;
        this.d = new hgi(2000L);
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188 A[SYNTHETIC] */
    @Override // defpackage.hse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ defpackage.kkc b(java.lang.Object r20, int r21, int r22, defpackage.hnj r23) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agql.b(java.lang.Object, int, int, hnj):kkc");
    }
}
