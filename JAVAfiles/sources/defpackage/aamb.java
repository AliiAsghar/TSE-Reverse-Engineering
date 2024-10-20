package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamb {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public final tqx b;
    public final rtb c;
    public final val d;
    public final apwt e;
    public final xnv f;
    public final wyt g;
    public final Context h;
    public final armf i;
    public final armf j;
    public final abbu k;
    public final Optional l;

    public aamb(tqx tqxVar, rtb rtbVar, val valVar, apwt apwtVar, xnv xnvVar, wyt wytVar, Context context, armf armfVar, armf armfVar2, abbu abbuVar, Optional optional) {
        this.b = tqxVar;
        this.c = rtbVar;
        this.d = valVar;
        this.e = apwtVar;
        this.f = xnvVar;
        this.g = wytVar;
        this.h = context;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = abbuVar;
        this.l = optional;
    }

    public static ContentValues a(String str, String str2, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        ContentValues contentValues = new ContentValues(9);
        contentValues.put("address", str);
        contentValues.put("body", str2);
        Long valueOf = Long.valueOf(j);
        contentValues.put("date_sent", valueOf);
        contentValues.put("date", valueOf);
        contentValues.put("read", Boolean.valueOf(z3));
        contentValues.put("seen", Boolean.valueOf(z2));
        contentValues.put("protocol", (Integer) 0);
        int i = 1;
        if (true == z) {
            i = 2;
        }
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
        if (j3 != -1) {
            contentValues.put("person", Long.valueOf(j3));
        }
        contentValues.put("sub_id", (Integer) (-1));
        contentValues.put("thread_id", Long.valueOf(j2));
        return contentValues;
    }

    public static Uri b(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public final MessagePartCoreData c(Uri uri, String str, String str2) {
        rtc a2 = rtd.a();
        a2.b = str;
        a2.c = str2;
        a2.d = uri;
        a2.e = uri;
        a2.k(ameb.NOT_AVAILABLE);
        return this.c.e(a2.a());
    }

    public final xzs d(Context context, int i, String str, int i2, TextView textView, ProgressBar progressBar, String str2, long j, int i3, long j2, wyt wytVar, Context context2) {
        int i4 = i * i2;
        aalz aalzVar = new aalz(this, progressBar, i4, textView, i, str, wytVar, new HashMap(), i2, new Random(), j - (a * i4), str2, new String[]{"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "indigo", "juliet", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu"}, j2, context, context2, i3);
        aalzVar.e(new Void[0]);
        return aalzVar;
    }
}
