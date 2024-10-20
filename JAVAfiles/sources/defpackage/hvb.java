package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvb implements hnl {
    public static final hni a = new hni("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, hni.a);
    private final Context b;

    public hvb(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        return c((Uri) obj, hnjVar);
    }

    @Override // defpackage.hnl
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    public final hpt c(Uri uri, hnj hnjVar) {
        Context context;
        int parseInt;
        Resources.Theme theme;
        Drawable a2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            if (authority.equals(this.b.getPackageName())) {
                context = this.b;
            } else {
                try {
                    context = this.b.createPackageContext(authority, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    if (authority.contains(this.b.getPackageName())) {
                        context = this.b;
                    } else {
                        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                    }
                }
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = context.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
                }
            } else if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
                }
            } else {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            hwr.i(authority);
            if (authority.equals(this.b.getPackageName())) {
                theme = (Resources.Theme) hnjVar.b(a);
            } else {
                theme = null;
            }
            if (theme == null) {
                a2 = hux.a(this.b, context, parseInt, null);
            } else {
                Context context2 = this.b;
                a2 = hux.a(context2, context2, parseInt, theme);
            }
            return hva.g(a2);
        }
        throw new IllegalStateException(hht.b(uri, "Package name for ", " is null or empty"));
    }
}
