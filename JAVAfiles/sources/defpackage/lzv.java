package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lzv implements lzu, lzp, ycw {
    public static Uri u(Context context, MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        if (messagePartCoreData.bp()) {
            return null;
        }
        if (messagePartCoreData.bv() && t != null) {
            return uhn.a(context, t, messagePartCoreData.X(), gh.a(messagePartCoreData.U()), messagePartCoreData.p());
        }
        return t;
    }

    public static Uri v(Context context, Uri uri, String str) {
        if (!uhl.k(uri, context) && !ydk.y(uri)) {
            return uri;
        }
        return uhn.a(context, uri, null, str, 0L);
    }

    public abstract void A(Context context);

    public abstract void B(Context context, Uri uri, String str);

    public abstract void C(Context context, MessageCoreData messageCoreData, amwf amwfVar);

    public abstract void D(Context context, Uri uri, String str);

    public abstract void E(cg cgVar, String str, int i, int i2, int i3, amqe amqeVar);

    public abstract void F(Context context, String str, String str2, boolean z, String str3);

    public abstract void G(Context context);

    public abstract void H(Context context);

    public abstract void I(Context context, ajwt ajwtVar);

    public abstract void J(Context context, ajwt ajwtVar);

    public abstract void K(MessagePartCoreData messagePartCoreData);

    public abstract void L(Uri uri, String str, Uri uri2, String str2);

    public abstract void M(Context context, msh mshVar, Point point, mdg mdgVar);

    public abstract Intent N(String str, Uri uri, Uri uri2);

    public abstract void O(Context context, ajwt ajwtVar);

    public abstract void P(Context context);

    public abstract void Q(Activity activity, Uri uri, Uri uri2);

    public abstract void R(cg cgVar, Uri uri, Uri uri2);

    public abstract void S(Activity activity, Uri uri, Uri uri2);

    public abstract void T(cg cgVar, Uri uri, Uri uri2);

    public abstract void U(Activity activity, String str, int i);

    public abstract void V(Context context);

    public abstract void W(Activity activity);

    public abstract void X(Context context);

    public abstract Intent i(Context context);

    public abstract Intent j(Context context);

    public abstract Intent k(Context context, int i, String str);

    public abstract Intent l(Activity activity);

    public abstract Intent m(Context context, int i);

    public abstract Intent n(Context context);

    public abstract Intent o(Context context);

    public abstract Intent p(Context context);

    public abstract Intent q(Context context);

    public abstract Intent r(Context context);

    public abstract Intent s(Context context);

    public abstract Intent t(Context context);

    public abstract void w(Context context, ajwt ajwtVar);

    public abstract void x(Context context);

    public abstract void y(Context context, String str);

    public abstract void z(Context context, ContentValues contentValues);
}
