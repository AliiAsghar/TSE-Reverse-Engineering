package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimz extends aimh implements Cloneable {
    public aina a;

    public aimz() {
        super("X-Google-Event-Id");
    }

    @Override // defpackage.aimh
    public final String a() {
        aina ainaVar = this.a;
        if (ainaVar == null) {
            return "";
        }
        return ainaVar.a;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final String c() {
        return this.c + ": " + this.a.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        aimz aimzVar = new aimz();
        aina ainaVar = this.a;
        if (ainaVar != null) {
            aimzVar.a = (aina) ainaVar.clone();
        }
        return aimzVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    @Override // defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof aimz)) {
            return false;
        }
        return this.a.equals(((aimz) obj).a);
    }

    @Override // defpackage.aimh
    public final int hashCode() {
        String str;
        aina ainaVar = this.a;
        if (ainaVar != null && (str = ainaVar.a) != null) {
            return str.hashCode();
        }
        return 11127650;
    }
}
