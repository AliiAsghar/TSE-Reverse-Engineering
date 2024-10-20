package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epe extends epd {
    public epe() {
        this((byte[]) null);
    }

    @Override // defpackage.epd
    public final Object a(epc epcVar) {
        return this.b.get(epcVar);
    }

    public final void b(epc epcVar, Object obj) {
        this.b.put(epcVar, obj);
    }

    public epe(epd epdVar) {
        epdVar.getClass();
        this.b.putAll(epdVar.b);
    }

    public /* synthetic */ epe(byte[] bArr) {
        this(epb.a);
    }
}
