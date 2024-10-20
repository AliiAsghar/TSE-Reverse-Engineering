package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appq {
    public boolean a;
    public int b;

    public appq() {
        this.b = -1;
    }

    public final ajwg a() {
        return new ajwg(this.b, this.a);
    }

    public final void b() {
        this.a = true;
    }

    public appq(byte[] bArr) {
    }

    public appq(char[] cArr) {
        this.b = R.style.SudThemeGlif_DayNight;
        this.a = true;
    }

    public appq(ajwg ajwgVar) {
        this.b = R.style.SudThemeGlif_DayNight;
        this.a = true;
        this.b = ajwgVar.b;
        String str = ajwgVar.c;
        this.a = ajwgVar.d;
    }
}
