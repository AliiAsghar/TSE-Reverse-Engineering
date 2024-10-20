package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alac extends alar {
    public final List a;
    private final Optional b;
    private final Optional c;

    public alac() {
        throw null;
    }

    @Override // defpackage.alar
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.alar
    public final Optional b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alac) {
            alac alacVar = (alac) obj;
            if (this.b.equals(alacVar.b) && this.c.equals(alacVar.c) && this.a.equals(alacVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        List list = this.a;
        Optional optional = this.c;
        return "ItemList{id=" + String.valueOf(this.b) + ", name=" + String.valueOf(optional) + ", listItems=" + String.valueOf(list) + "}";
    }

    public alac(Optional optional, Optional optional2, List list) {
        this.b = optional;
        this.c = optional2;
        this.a = list;
    }
}
