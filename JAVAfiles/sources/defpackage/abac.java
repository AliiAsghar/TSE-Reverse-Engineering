package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abac {
    public final Object a;
    public final Object b;

    public abac(PhoneNumberInputV2Activity phoneNumberInputV2Activity, armf armfVar) {
        this.a = phoneNumberInputV2Activity;
        this.b = armfVar;
    }

    public static void b(Uri uri, abce abceVar) {
        if (uri != null && !uri.equals(Uri.EMPTY)) {
            abceVar.a(uri);
        }
    }

    public final Uri a(String str) {
        try {
            return uhl.h(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str), "vcf", (Context) this.b);
        } catch (Exception e) {
            xzb.i("Bugle", e, "Error while copying vcard to scratch space for lookupKey ".concat(String.valueOf(str)));
            return Uri.EMPTY;
        }
    }

    public final void c(Uri uri, abce abceVar) {
        new abcc(this, uri, abceVar).e(new Void[0]);
    }

    public final void d() {
        ((abbt) this.a).c();
    }

    public final void e(int i) {
        ((abbt) this.a).a.setColor(i);
    }

    public final void f() {
        Object obj = this.a;
        abbt abbtVar = (abbt) obj;
        abbtVar.b.setClippingEnabled(true);
        abbtVar.b.setAnimationStyle(R.style.Animation.Dialog);
        abbtVar.b.setBackgroundDrawable(new ColorDrawable(0));
        abbtVar.b.setOutsideTouchable(abbtVar.c);
        abbtVar.b.setFocusable(abbtVar.d);
        abbtVar.g.post(new aaxu(obj, 8));
    }

    public final boolean g() {
        PopupWindow popupWindow = ((abbt) this.a).b;
        if (popupWindow != null && popupWindow.isShowing()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final aatf h(Cursor cursor) {
        Context context = (Context) this.a.b();
        context.getClass();
        ydk ydkVar = (ydk) this.b.b();
        ydkVar.getClass();
        cursor.getClass();
        return new aatf(context, ydkVar, cursor);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    public final aaqq i(cg cgVar, Boolean bool, rre rreVar, aabp aabpVar, AttachmentQueueState attachmentQueueState, ContentGridView contentGridView, aabz aabzVar, aapf aapfVar, aaqt aaqtVar, aapk aapkVar) {
        alor alorVar = (alor) this.b.b();
        ykw ykwVar = (ykw) this.a.b();
        ykwVar.getClass();
        rreVar.getClass();
        attachmentQueueState.getClass();
        aabzVar.getClass();
        return new aaqq(alorVar, ykwVar, cgVar, bool, rreVar, aabpVar, attachmentQueueState, contentGridView, aabzVar, aapfVar, aaqtVar, aapkVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    public final void j(String str, String str2) {
        String[] strArr = tma.a;
        int i = tls.a;
        tmc tmcVar = new tmc((byte[]) null);
        tmcVar.d((String) this.b);
        tmcVar.b(str);
        tmcVar.c(str2);
        this.a.add(tmcVar.a());
    }

    public final void k(String str) {
        j("", str);
    }

    public abac(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public abac() {
        this.a = new Path();
        this.b = new PathMeasure();
    }

    public abac(String str) {
        this.b = str;
        this.a = new ArrayList();
    }

    public abac(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public abac(View view, int i, View view2, int i2) {
        view.getClass();
        view2.getClass();
        this.b = view;
        abbt abbtVar = new abbt(view2.getContext());
        abbtVar.setWillNotDraw(false);
        abbtVar.setLayerType(1, abbtVar.a);
        abbtVar.setOnClickListener(new ili(8));
        this.a = abbtVar;
        abbtVar.e = view;
        abbtVar.b = new PopupWindow(abbtVar);
        abbtVar.addView(view);
        abbtVar.g = view2;
        abbtVar.d();
        abbtVar.f = i;
        abbtVar.h = i2;
    }

    public abac(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
