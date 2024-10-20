package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.google.android.apps.messaging.R;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzj extends ajuc {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal");

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        yjv gl();

        alog hP();
    }

    private static MatrixCursor d() {
        return new MatrixCursor(ajub.b);
    }

    private final boolean e() {
        return ((a) akec.w(getContext(), a.class)).gl().e();
    }

    @Override // defpackage.ajuc
    public final Cursor a() {
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 65, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying NonIndexableKeys.");
        if (!e()) {
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryNonIndexableKeys", 67, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not SMS capable.");
            return d();
        }
        MatrixCursor matrixCursor = new MatrixCursor(ajub.c);
        if (((Boolean) ((utz) zli.b.get()).e()).booleanValue()) {
            Context context = getContext();
            context.getClass();
            matrixCursor.addRow(new Object[]{context.getString(R.string.cmc_consent_key)});
        }
        Context context2 = getContext();
        context2.getClass();
        matrixCursor.addRow(new Object[]{context2.getString(R.string.profile_pref_key)});
        return matrixCursor;
    }

    @Override // defpackage.ajuc
    public final Cursor b() {
        return d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ajuc
    public final Cursor c() {
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 50, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: Querying XmlResources.");
        if (!e()) {
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/settings/search/MessagesSearchIndexablesProvider$MessagesSearchIndexablesProviderInternal", "queryXmlResources", 52, "MessagesSearchIndexablesProvider.java")).q("MessagesSearchIndexablesProvider: The device is not sms capable");
            return d();
        }
        lrf lrfVar = new lrf(this, ((a) akec.w(getContext(), a.class)).hP());
        int i = 15;
        Collection.EL.stream(lrfVar.a).filter(new ilu(i)).forEach(new leq(lrfVar, i));
        return lrfVar.c;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }
}
