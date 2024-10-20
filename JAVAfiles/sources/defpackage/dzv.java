package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzv {
    public final CharSequence a;
    final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public dzv(dzu dzuVar) {
        this.a = dzuVar.a;
        this.b = dzuVar.b;
        this.c = dzuVar.c;
        this.d = dzuVar.d;
        this.e = dzuVar.e;
        this.f = dzuVar.f;
    }

    public static dzv b(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        dzu dzuVar = new dzu();
        dzuVar.a = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.e(bundle2);
        } else {
            iconCompat = null;
        }
        dzuVar.b = iconCompat;
        dzuVar.c = bundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        dzuVar.d = bundle.getString("key");
        dzuVar.e = bundle.getBoolean("isBot");
        dzuVar.f = bundle.getBoolean("isImportant");
        return new dzv(dzuVar);
    }

    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.b) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.c);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.c);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.c);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.c);
                    break;
            }
            bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, iconCompat.b);
            bundle.putInt("int1", iconCompat.f);
            bundle.putInt("int2", iconCompat.g);
            bundle.putString("string1", iconCompat.k);
            ColorStateList colorStateList = iconCompat.h;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.i;
            if (mode != IconCompat.a) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dzv)) {
            return false;
        }
        dzv dzvVar = (dzv) obj;
        String str = this.d;
        String str2 = dzvVar.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(this.a), Objects.toString(dzvVar.a)) && Objects.equals(this.c, dzvVar.c)) {
                if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(dzvVar.e))) {
                    if (Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(dzvVar.f))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
