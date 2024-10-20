package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcg {
    public final boolean a;
    public final zej b;
    public final yzi c;
    public final ascv d;
    public final zaq e;
    public final ascv f;
    public final zdw g;
    public final ascv h;
    public final ascg i;

    public zcg(boolean z, zej zejVar, yzi yziVar, ascv ascvVar, zaq zaqVar, ascv ascvVar2, zdw zdwVar, ascv ascvVar3, ascg ascgVar) {
        ascvVar.getClass();
        ascvVar2.getClass();
        zdwVar.getClass();
        this.a = z;
        this.b = zejVar;
        this.c = yziVar;
        this.d = ascvVar;
        this.e = zaqVar;
        this.f = ascvVar2;
        this.g = zdwVar;
        this.h = ascvVar3;
        this.i = ascgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcg)) {
            return false;
        }
        zcg zcgVar = (zcg) obj;
        if (this.a == zcgVar.a && d.F(this.b, zcgVar.b) && d.F(this.c, zcgVar.c) && d.F(this.d, zcgVar.d) && d.F(this.e, zcgVar.e) && d.F(this.f, zcgVar.f) && d.F(this.g, zcgVar.g) && d.F(this.h, zcgVar.h) && d.F(this.i, zcgVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((a.v(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "StartChatScreenUiData(isGroupRenameMode=" + this.a + ", topAppBarUiData=" + this.b + ", contactListUiData=" + this.c + ", extendedFabUiData=" + this.d + ", destinationsDialogUiData=" + this.e + ", groupNameUiData=" + this.f + ", toastUiData=" + this.g + ", popupUiDataFlow=" + this.h + ", snackbarUiDataFlow=" + this.i + ")";
    }
}
