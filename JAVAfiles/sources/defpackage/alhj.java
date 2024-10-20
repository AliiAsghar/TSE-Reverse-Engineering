package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhj implements alhn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public alhj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.alhn
    public final /* synthetic */ Iterator a(anna annaVar, CharSequence charSequence) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new alhk(annaVar, charSequence, ((algd) this.a).a(charSequence));
            }
            return new alhh(annaVar, charSequence, (algc) this.a);
        }
        return new alhi(annaVar, charSequence, (String) this.a);
    }
}
