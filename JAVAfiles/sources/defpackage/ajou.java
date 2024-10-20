package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajou extends ajpl {
    private final Optional a;
    private final Optional b;
    private final int c;

    public ajou(int i, Optional optional, Optional optional2) {
        this.c = i;
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.ajpl
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.ajpl
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.ajpl
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpl) {
            ajpl ajplVar = (ajpl) obj;
            if (this.c == ajplVar.c() && this.a.equals(ajplVar.a()) && this.b.equals(ajplVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        if (this.c != 1) {
            str = "STOP";
        } else {
            str = "START";
        }
        Optional optional = this.a;
        Optional optional2 = this.b;
        return "IsComposingMessage{state=" + str + ", refresh=" + optional.toString() + ", timestamp=" + optional2.toString() + "}";
    }
}
