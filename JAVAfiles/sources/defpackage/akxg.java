package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxg {
    public final alau a;
    private alav b;

    public akxg(alau alauVar) {
        this.a = alauVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akxg) {
            akxg akxgVar = (akxg) obj;
            alav alavVar = akxgVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.a, akxgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(null, this.a);
    }
}
