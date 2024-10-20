package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbc {
    public static final Status a = new Status(13);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(GoogleHelp googleHelp) {
        ArrayList arrayList;
        int i = googleHelp.M;
        if (i == 0 || i == 1) {
            synchronized (acbg.a) {
                arrayList = new ArrayList(acbg.a);
            }
            if (!arrayList.isEmpty()) {
                googleHelp.N = arrayList;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(acbb acbbVar, Activity activity, Intent intent, GoogleHelp googleHelp) {
        InProductHelp createFromParcel;
        byte[] bArr = null;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator<InProductHelp> creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                createFromParcel = null;
            } else {
                abhg.m(creator);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
            }
            InProductHelp inProductHelp = createFromParcel;
            inProductHelp.a = googleHelp;
            abhi.d(inProductHelp, intent);
        }
        new acda(Looper.getMainLooper()).post(new acaj(activity, intent, 2, bArr));
        acbbVar.j(Status.a);
    }
}
