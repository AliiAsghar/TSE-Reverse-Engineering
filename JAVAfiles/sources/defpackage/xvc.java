package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvc implements xzh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static Bitmap e;
    private static Bitmap f;
    private static Bitmap g;
    private static Bitmap h;
    private static Bitmap i;
    private static Bitmap j;
    public final Context b;
    public final armf c;
    private Bitmap k;
    private Bitmap l;
    private Bitmap m;
    private Bitmap n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final Optional r;
    private final armf s;
    private final armf t;
    private final armf u;

    public xvc(Context context, armf armfVar, armf armfVar2, armf armfVar3, Optional optional, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = context;
        this.o = armfVar2;
        this.p = armfVar3;
        this.q = armfVar;
        this.r = optional;
        this.s = armfVar4;
        this.t = armfVar5;
        this.u = armfVar6;
        this.c = armfVar7;
    }

    private static int A(float f2, int i2) {
        int round = Math.round(i2 * f2);
        if (round >= i2) {
            return 0;
        }
        return round;
    }

    private static Uri B(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("o");
        return builder.build();
    }

    private static Uri C(Context context, Uri uri, Uri uri2) {
        xyl.l(uri);
        xyl.l(uri2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("r");
        builder.appendQueryParameter("m", uri.toString());
        builder.appendQueryParameter("f", uri2.toString());
        return builder.build();
    }

    private static Uri D(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("sm");
        return builder.build();
    }

    private static Uri E(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("p");
        return builder.build();
    }

    private final boolean F(CharSequence charSequence) {
        armf armfVar = this.o;
        char charAt = charSequence.charAt(0);
        ydc ydcVar = (ydc) armfVar.b();
        if ((charSequence.length() > 0 && ydcVar.d(charSequence.subSequence(0, 1))) || ((charSequence.length() >= 2 && ydcVar.d(charSequence.subSequence(0, 2))) || "+0123456789".indexOf(charAt) != -1)) {
            return false;
        }
        return true;
    }

    private static boolean G(boolean z, boolean z2) {
        if (z && !z2) {
            return true;
        }
        return false;
    }

    private final Uri H(ParticipantColor participantColor) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(this.b));
        builder.appendPath("z");
        if (participantColor != null && !participantColor.g()) {
            builder.appendQueryParameter("x", String.valueOf(((yje) this.p.b()).f));
        }
        return builder.build();
    }

    private final Uri I(msh mshVar, ParticipantColor participantColor) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(this.b));
        builder.appendPath("d");
        if (!mshVar.D()) {
            builder.appendQueryParameter("i", mshVar.o(((Boolean) new mst(18).get()).booleanValue()));
        }
        if (participantColor != null && !participantColor.g()) {
            builder.appendQueryParameter("x", String.valueOf(((yje) this.p.b()).f));
        }
        return builder.build();
    }

    private final synchronized Bitmap J(Context context, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i4;
        int i5;
        Bitmap createBitmap;
        boolean z5 = false;
        if (z3 && !z) {
            z5 = true;
        }
        boolean G = G(z2, z);
        if (z) {
            bitmap = f;
            bitmap2 = i;
            i4 = R.drawable.quantum_ic_business_white_48;
            i5 = R.drawable.quantum_ic_business_white_24;
        } else if (G) {
            bitmap = g;
            bitmap2 = j;
            i4 = R.drawable.quantum_ic_report_black_48;
            i5 = R.drawable.quantum_ic_report_black_24;
        } else if (z5) {
            bitmap = this.k;
            bitmap2 = this.m;
            i4 = R.drawable.quantum_ic_do_not_disturb_black_48;
            i5 = R.drawable.quantum_ic_do_not_disturb_black_24;
        } else if (z4) {
            bitmap = this.l;
            bitmap2 = this.n;
            i4 = R.drawable.quantum_ic_sos_black_48;
            i5 = R.drawable.quantum_ic_sos_black_24;
        } else {
            bitmap = e;
            bitmap2 = h;
            i4 = R.drawable.ic_logo_avatar_anonymous_large;
            i5 = R.drawable.ic_logo_avatar_anonymous;
        }
        if (bitmap == null || bitmap2 == null) {
            if (bitmap == null) {
                Resources resources = context.getResources();
                Resources.Theme theme = context.getTheme();
                WeakHashMap weakHashMap = ean.a;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) resources.getDrawable(i5, theme);
                if (bitmapDrawable != null) {
                    bitmap = bitmapDrawable.getBitmap();
                } else {
                    bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                }
            }
            if (bitmap2 == null) {
                Resources resources2 = context.getResources();
                Resources.Theme theme2 = context.getTheme();
                WeakHashMap weakHashMap2 = ean.a;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) resources2.getDrawable(i4, theme2);
                if (bitmapDrawable2 != null) {
                    createBitmap = bitmapDrawable2.getBitmap();
                } else {
                    createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                }
                bitmap2 = createBitmap;
            }
            if (z) {
                f = bitmap;
                i = bitmap2;
            } else if (G) {
                g = bitmap;
                j = bitmap2;
            } else if (z5) {
                this.k = bitmap;
                this.m = bitmap2;
            } else if (z4) {
                this.l = bitmap;
                this.n = bitmap2;
            } else {
                e = bitmap;
                h = bitmap2;
            }
        }
        if (i2 <= bitmap.getWidth()) {
            if (i3 <= bitmap.getHeight()) {
                return bitmap;
            }
        }
        return bitmap2;
    }

    public static Uri c(Context context) {
        return new Uri.Builder().scheme("content").authority(yyb.bB(context)).appendPath("b").build();
    }

    public static Uri d(Uri uri) {
        xyl.l(uri);
        String queryParameter = uri.getQueryParameter("f");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri e(Uri uri) {
        xyl.l(uri);
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri f(Context context, List list) {
        boolean z;
        xyl.l(list);
        xyl.k(!list.isEmpty());
        if (list.size() == 1) {
            Uri uri = (Uri) list.get(0);
            xyl.k(p(context, uri));
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("g");
        int min = Math.min(list.size(), 4);
        for (int i2 = 0; i2 < min; i2++) {
            Uri uri2 = (Uri) list.get(i2);
            xyl.l(uri2);
            if (!ydk.v(uri2) && !p(context, uri2) && !ydk.B(uri2)) {
                z = false;
            } else {
                z = true;
            }
            albo.T(z);
            builder.appendQueryParameter("p", uri2.toString());
        }
        return builder.build();
    }

    public static OptionalInt g(Uri uri) {
        uri.getClass();
        String queryParameter = uri.getQueryParameter("t");
        if (queryParameter == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(Integer.parseInt(queryParameter));
    }

    public static Integer h(Uri uri) {
        String queryParameter;
        xyl.l(uri);
        if (uri != null && (queryParameter = uri.getQueryParameter("x")) != null) {
            return Integer.valueOf(queryParameter);
        }
        return null;
    }

    public static String i(String str, msh mshVar) {
        int i2 = 18;
        if (!mshVar.x(((Boolean) new mst(i2).get()).booleanValue()) && !mshVar.D()) {
            return mshVar.o(((Boolean) new mst(i2).get()).booleanValue());
        }
        return str;
    }

    public static String j(Uri uri) {
        if (uri == null) {
            return "d";
        }
        return (String) Collection.EL.stream(uri.getPathSegments()).findFirst().orElse("d");
    }

    public static String k(Uri uri) {
        xyl.l(uri);
        return yyb.bz(uri.getQueryParameter("i"));
    }

    public static String m(Uri uri) {
        xyl.l(uri);
        return uri.getQueryParameter("n");
    }

    public static List n(Uri uri) {
        xyl.l(uri);
        return uri.getQueryParameters("p");
    }

    public static synchronized void o() {
        synchronized (xvc.class) {
            e = null;
            f = null;
            h = null;
            i = null;
        }
    }

    public static boolean p(Context context, Uri uri) {
        xyl.l(uri);
        if (uri != null && TextUtils.equals("content", uri.getScheme()) && TextUtils.equals(yyb.bB(context), uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean q(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!p(context, uri) && !ydk.t(uri) && !ydk.B(uri) && !j(uri).equals("h") && !ydk.x(uri, ujy.f(context)) && !ydk.x(uri, String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.RbmBusinessInfoFileProvider"))) {
            return false;
        }
        return true;
    }

    public static Uri t(Context context, String str, boolean z, int i2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(context));
        builder.appendPath("s");
        builder.appendQueryParameter("i", str);
        builder.appendQueryParameter("c", String.valueOf(i2));
        builder.appendQueryParameter("s", String.valueOf(z));
        builder.appendQueryParameter("g", "false");
        return builder.build();
    }

    public static String u(Uri uri) {
        xyl.l(uri);
        return yyb.bA(false, uri.getQueryParameter("i"));
    }

    public static final boolean v(Uri uri) {
        if (uri != null) {
            String j2 = j(uri);
            if (xuz.a.contains(j2)) {
                alvw d2 = a.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 672, "AvatarUriUtilImpl.java")).t("Provided Uri was Verified SMS applicable: %s", new ivm(uri, 3));
                return true;
            }
            if (TextUtils.equals("r", j2)) {
                Uri e2 = e(uri);
                if (e2 != null && xuz.a.contains(j(e2))) {
                    alvw d3 = a.d();
                    d3.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 686, "AvatarUriUtilImpl.java")).t("Primary Uri was Verified SMS applicable: %s", new ivm(uri, 4));
                    return true;
                }
                Uri d4 = d(uri);
                if (d4 != null && xuz.a.contains(j(d4))) {
                    alvw d5 = a.d();
                    d5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d5).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 697, "AvatarUriUtilImpl.java")).t("Fallback Uri was Verified SMS applicable: %s", new ivm(uri, 5));
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Uri a() {
        return w(null, null, ((msk) this.s.b()).f(), null);
    }

    public final Uri b(Uri uri, tqr tqrVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority(yyb.bB(this.b)).appendPath("z");
        Uri build = appendPath.appendQueryParameter("x", String.valueOf(this.b.getColor(R.color.verified_sms_business_color_light))).appendQueryParameter("v", Boolean.TRUE.toString()).build();
        if (tqrVar != tqr.VERIFICATION_IN_PROGRESS && tqrVar != tqr.VERIFICATION_NA) {
            if (tqrVar == tqr.VERIFICATION_UNVERIFIED) {
                Uri.Builder appendPath2 = new Uri.Builder().scheme("content").authority(yyb.bB(this.b)).appendPath("u");
                Context context = this.b;
                Uri.Builder appendQueryParameter = appendPath2.appendQueryParameter("t", String.valueOf(context.getColor(R.color.unverified_sms_business_foreground_color_light)));
                Context context2 = this.b;
                return appendQueryParameter.appendQueryParameter("x", String.valueOf(context2.getColor(R.color.unverified_sms_business_background_color_light))).appendQueryParameter("v", Boolean.TRUE.toString()).appendQueryParameter("vsms_autogen", String.valueOf(((Boolean) ytk.c.e()).toString()).concat(String.valueOf(UUID.randomUUID().toString()))).build();
            }
            if (uri != null && !TextUtils.isEmpty(uri.toString()) && !p(this.b, uri)) {
                return C(this.b, uri, build).buildUpon().appendQueryParameter("v", Boolean.TRUE.toString()).build();
            }
        }
        return build;
    }

    @Override // defpackage.xzh
    public final void l(int i2) {
        o();
    }

    public final Uri r(CharSequence charSequence, msh mshVar, ParticipantColor participantColor) {
        xyl.l(charSequence);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(yyb.bB(this.b));
        builder.appendPath("l");
        String valueOf = String.valueOf(charSequence);
        builder.appendQueryParameter("n", valueOf);
        builder.appendQueryParameter("i", i(valueOf, mshVar));
        if (participantColor != null && !participantColor.g()) {
            builder.appendQueryParameter("x", String.valueOf(((yje) this.p.b()).f));
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri s(android.net.Uri r6, java.lang.CharSequence r7, defpackage.msh r8, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvc.s(android.net.Uri, java.lang.CharSequence, msh, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor, boolean, boolean, boolean):android.net.Uri");
    }

    public final Uri w(Uri uri, CharSequence charSequence, msh mshVar, ParticipantColor participantColor) {
        return s(uri, charSequence, mshVar, participantColor, false, false, false);
    }

    final int x(String str, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5) {
        if (z4 && !z2) {
            return ((yje) this.p.b()).b.getColor(R.color.block_icon_background_color_m2);
        }
        if (G(z3, z2)) {
            yje yjeVar = (yje) this.p.b();
            yyb yybVar = yjeVar.h;
            return yjeVar.b.getColor(R.color.spam_icon_background_color_m2);
        }
        if (z5) {
            yje yjeVar2 = (yje) this.p.b();
            yyb yybVar2 = yjeVar2.h;
            return yjeVar2.b.getColor(R.color.emergency_avatar_background_color);
        }
        if (z) {
            yje yjeVar3 = (yje) this.p.b();
            if (((Boolean) yjd.a.e()).booleanValue()) {
                return yjeVar3.b.getColor(R.color.oneplus_unknown_sender_background);
            }
            yyb yybVar3 = yjeVar3.h;
            return yjeVar3.d[0].getColor(0, 0);
        }
        if (!z2) {
            return ((yje) this.p.b()).f(str);
        }
        if (num == null) {
            return ((yje) this.p.b()).d(str).a;
        }
        return num.intValue();
    }

    public final Bitmap y(String str, int i2, int i3, boolean z, boolean z2, Integer num, xvb xvbVar, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        if (z4 && !z) {
            z6 = z3;
            z7 = true;
        } else {
            z6 = z3;
            z7 = false;
        }
        boolean G = G(z6, z);
        if (!G && !z7 && !z && !z5) {
            this.r.isPresent();
        }
        Bitmap a2 = xvbVar.a(i2, i3, x(str, z2, z, num, G, z7, z5));
        Canvas canvas = new Canvas(a2);
        Bitmap J = J(this.b, z, i2, i3, G, z7, z5);
        Paint paint = new Paint(1);
        if (z) {
            paint.setColorFilter(new PorterDuffColorFilter(((yje) this.p.b()).g, PorterDuff.Mode.SRC_IN));
            i5 = A(0.17f, i2);
            i4 = A(0.17f, i3);
        } else if (z7) {
            yje yjeVar = (yje) this.p.b();
            yyb yybVar = yjeVar.h;
            paint.setColorFilter(new PorterDuffColorFilter(yjeVar.b.getColor(R.color.block_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            i5 = A(brg.a, i2);
            i4 = A(brg.a, i3);
        } else if (G) {
            yje yjeVar2 = (yje) this.p.b();
            yyb yybVar2 = yjeVar2.h;
            paint.setColorFilter(new PorterDuffColorFilter(yjeVar2.b.getColor(R.color.spam_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            i5 = A(0.14f, i2);
            i4 = A(0.14f, i3);
        } else if (z5) {
            yje yjeVar3 = (yje) this.p.b();
            yyb yybVar3 = yjeVar3.h;
            paint.setColorFilter(new PorterDuffColorFilter(yjeVar3.b.getColor(R.color.emergency_avatar_foreground_color), PorterDuff.Mode.SRC_IN));
            i5 = A(0.2f, i2);
            i4 = A(0.2f, i3);
        } else {
            paint.setColorFilter(new PorterDuffColorFilter(((yje) this.p.b()).g, PorterDuff.Mode.SRC_IN));
            i4 = 0;
            i5 = 0;
        }
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(brg.a, brg.a, J.getWidth(), J.getHeight()), new RectF(i5, i4, i2 - i5, i3 - i4), Matrix.ScaleToFit.FILL);
        canvas.drawBitmap(J, matrix, paint);
        return a2;
    }

    public final Bitmap z(String str, String str2, int i2, int i3, Integer num, xvb xvbVar, boolean z, OptionalInt optionalInt) {
        int min = Math.min(i2, i3);
        if (!z) {
            this.r.isPresent();
        }
        Bitmap a2 = xvbVar.a(i2, i3, x(str2, false, z, num, false, false, false));
        Resources resources = this.b.getResources();
        Paint paint = new Paint(1);
        paint.setTypeface(xvw.a(this.b));
        paint.setColor(optionalInt.orElse(((yje) this.p.b()).g));
        paint.setTextSize(resources.getFraction(R.fraction.letter_to_tile_ratio, 1, 1) * min);
        String upperCase = str.substring(0, 1).toUpperCase(yhx.b(this.b));
        paint.getTextBounds(upperCase, 0, 1, new Rect());
        new Canvas(a2).drawText(upperCase, (i2 / 2.0f) - r5.centerX(), (i3 / 2.0f) - r5.centerY(), paint);
        return a2;
    }
}
