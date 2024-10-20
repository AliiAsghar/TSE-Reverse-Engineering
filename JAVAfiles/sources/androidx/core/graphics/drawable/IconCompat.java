package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.a;
import defpackage.dyd;
import defpackage.dzd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static IconCompat e(Bundle bundle) {
        int i = bundle.getInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", a.bV(i, "Unknown type "));
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat f(Bitmap bitmap) {
        dyd.e(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Context context, int i) {
        dyd.e(context);
        return h(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat h(Resources resources, String str, int i) {
        dyd.e(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f = i;
            if (resources != null) {
                try {
                    iconCompat.c = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.c = str;
            }
            iconCompat.k = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int a() {
        int i = this.b;
        if (i != -1) {
            if (i == 2) {
                return this.f;
            }
            toString();
            throw new IllegalStateException("called getResId() on ".concat(toString()));
        }
        return dzd.d(this.c);
    }

    public final int b() {
        int i = this.b;
        if (i == -1) {
            return dzd.e(this.c);
        }
        return i;
    }

    @Deprecated
    public final Icon c() {
        return dzd.f(this, null);
    }

    public final Uri d() {
        int i = this.b;
        if (i != -1) {
            if (i != 4 && i != 6) {
                toString();
                throw new IllegalStateException("called getUri() on ".concat(toString()));
            }
            return Uri.parse((String) this.c);
        }
        return dzd.g(this.c);
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
