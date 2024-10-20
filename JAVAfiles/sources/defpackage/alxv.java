package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxv extends alzz {
    final /* synthetic */ Set a;
    private final alxh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alxv(Set set) {
        super(null);
        this.a = set;
        this.b = alxk.a(set);
    }

    @Override // defpackage.alzz
    public final String a(alwv alwvVar, alxr alxrVar) {
        if (alxw.b(alwvVar, alxrVar, this.a)) {
            StringBuilder sb = new StringBuilder();
            alzr.e(alwvVar, sb);
            alxw.c(alxrVar, this.b, sb);
            return sb.toString();
        }
        return alxw.a(alwvVar);
    }
}
