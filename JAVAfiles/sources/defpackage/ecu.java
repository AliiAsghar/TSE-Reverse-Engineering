package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecu implements ect {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public ecu(ecr ecrVar) {
        ClipData clipData = ecrVar.a;
        dye.i(clipData);
        this.a = clipData;
        int i = ecrVar.b;
        if (i >= 0) {
            if (i <= 5) {
                this.b = i;
                int i2 = ecrVar.c;
                if ((i2 & 1) == i2) {
                    this.c = i2;
                    this.d = ecrVar.d;
                    this.e = ecrVar.e;
                    return;
                } else {
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
    }

    @Override // defpackage.ect
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ect
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ect
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.ect
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.ect
    public final Bundle e() {
        return this.e;
    }

    @Override // defpackage.ect
    public final ContentInfo f() {
        return null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            str = "SOURCE_PROCESS_TEXT";
                        } else {
                            str = "SOURCE_AUTOFILL";
                        }
                    } else {
                        str = "SOURCE_DRAG_AND_DROP";
                    }
                } else {
                    str = "SOURCE_INPUT_METHOD";
                }
            } else {
                str = "SOURCE_CLIPBOARD";
            }
        } else {
            str = "SOURCE_APP";
        }
        sb.append(str);
        sb.append(", flags=");
        if (1 != this.c) {
            str2 = "0";
        } else {
            str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        sb.append(str2);
        String str4 = "";
        if (this.d == null) {
            str3 = "";
        } else {
            str3 = ", hasLinkUri(" + this.d.toString().length() + ")";
        }
        sb.append(str3);
        if (this.e != null) {
            str4 = ", hasExtras";
        }
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
