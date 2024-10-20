package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmt extends dzm {
    final /* synthetic */ arvo a;
    final /* synthetic */ dkx b;

    public dmt(arvo arvoVar, dkx dkxVar) {
        this.a = arvoVar;
        this.b = dkxVar;
    }

    @Override // defpackage.dzm
    public final void a(int i) {
        String str;
        StringBuilder sb = new StringBuilder("Failed to load ");
        sb.append(this.b);
        sb.append(" (reason=");
        sb.append(i);
        sb.append(", ");
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str = "Unknown error code";
                            } else {
                                str = "The given query was not supported by this provider.";
                            }
                        } else {
                            str = "The provider found the queried font, but it is currently unavailable.";
                        }
                    } else {
                        str = "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml";
                    }
                } else {
                    str = "The requested provider was not found on this device.";
                }
            } else {
                str = "The given provider cannot be authenticated with the certificates given.";
            }
        } else {
            str = "Generic error loading font, for example variation settings were not parsable";
        }
        arvo arvoVar = this.a;
        sb.append(str);
        sb.append(')');
        arvoVar.h(new IllegalStateException(sb.toString()));
    }

    @Override // defpackage.dzm
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}
