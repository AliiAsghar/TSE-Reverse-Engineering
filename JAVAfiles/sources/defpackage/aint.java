package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aint extends ailc {
    public aint() {
        super((byte[]) null);
    }

    @Override // defpackage.ailc
    public final aimh h() {
        try {
            i(2111);
            this.a.h();
            aimd aimdVar = new aimd();
            this.a.a(4095);
            String str = this.a.e.a;
            if (str != null) {
                aimdVar.a = str;
                super.r(aimdVar);
                this.a.h();
                this.a.a(10);
                return aimdVar;
            }
            throw new IllegalArgumentException("The eventType must not be null");
        } catch (ailb e) {
            throw a(e.getMessage());
        }
    }
}
