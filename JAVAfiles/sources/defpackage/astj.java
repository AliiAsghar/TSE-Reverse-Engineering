package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astj implements asst {
    private final String a;
    private final /* synthetic */ int b;

    public astj(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.asst
    public final String a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return this.a;
            }
            throw null;
        }
        return this.a;
    }
}
