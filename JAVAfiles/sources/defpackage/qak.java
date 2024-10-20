package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qak extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(qam qamVar) {
        int ordinal;
        if (qamVar == null) {
            ordinal = 0;
        } else {
            ordinal = qamVar.ordinal();
        }
        U(new agoi("file_processing.file_type", 1, Integer.valueOf(ordinal)));
    }

    public final void c(pyz pyzVar) {
        U(new agmd("file_processing.processing_id", 1, pyz.a(pyzVar)));
    }
}
