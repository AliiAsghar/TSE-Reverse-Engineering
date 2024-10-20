package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajos extends ajpg {
    private final ajpf a;
    private final Optional b;

    public ajos(ajpf ajpfVar, Optional optional) {
        this.a = ajpfVar;
        this.b = optional;
    }

    @Override // defpackage.ajpg
    public final ajpf a() {
        return this.a;
    }

    @Override // defpackage.ajpg
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpg) {
            ajpg ajpgVar = (ajpg) obj;
            if (this.a.equals(ajpgVar.a()) && this.b.equals(ajpgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "FileTransferInformation{fileInformation=" + this.a.toString() + ", thumbnailInformation=" + optional.toString() + "}";
    }
}
