package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gv extends gm {
    private static final alvi c = alvi.m("android/support/v7/mms/pdu/SendReq");

    public gv() {
        try {
            c(128);
            d(18);
            this.a.j("application/vnd.wap.multipart.related".getBytes(), 132);
            b(new gi("insert-address-token".getBytes()));
            j("T".concat(String.valueOf(Long.toHexString(System.currentTimeMillis()))).getBytes());
        } catch (gk e) {
            alvw h = c.h();
            h.X(alwp.a, "PduParser");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("android/support/v7/mms/pdu/SendReq", "<init>", '*', "SendReq.java")).q("Unexpected InvalidHeaderValueException.");
            throw new RuntimeException(e);
        }
    }

    public final void j(byte[] bArr) {
        this.a.j(bArr, 152);
    }

    public gv(gp gpVar, gqg gqgVar) {
        super(gpVar, gqgVar);
    }
}
