package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailw extends aimh implements Cloneable {
    public final String a;

    public ailw(String str) {
        super("X-Pidgey-Conference-Params");
        this.a = str;
    }

    @Override // defpackage.aimh
    public final String a() {
        String str = this.a;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final String c() {
        return this.c + ": " + this.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        return new ailw(this.a);
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    @Override // defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof ailw)) {
            return false;
        }
        return this.a.equals(((ailw) obj).a);
    }

    @Override // defpackage.aimh
    public final int hashCode() {
        return 22227650;
    }
}
