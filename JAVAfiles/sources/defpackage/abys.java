package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abys implements Runnable {
    private final Context a;
    private final long b;
    private final /* synthetic */ int c;
    private final abmr d;

    public abys(Context context, abmr abmrVar, long j, int i) {
        this.c = i;
        this.a = context;
        this.d = abmrVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        List list;
        if (this.c != 0) {
            Bundle bundle = new Bundle(1);
            try {
                abyt abytVar = new abyt();
                abytVar.c();
                list = this.d.a();
                File cacheDir = this.a.getCacheDir();
                if (list != null && !list.isEmpty() && cacheDir != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((FileTeleporter) it.next()).e = cacheDir;
                    }
                }
                bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(abytVar.a()));
            } catch (Exception e) {
                Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
                bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
                list = null;
            }
            long j = this.b;
            Context context = this.a;
            FeedbackOptions a = FeedbackOptions.a(list);
            abrg abrgVar = new abrc(context).i;
            abyj abyjVar = new abyj(abrgVar, a, bundle, j);
            abrgVar.b(abyjVar);
            abhg.o(abyjVar);
            return;
        }
        try {
            abyt abytVar2 = new abyt();
            abytVar2.c();
            singletonList = this.d.b();
            if (singletonList == null) {
                singletonList = new ArrayList(1);
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(abytVar2.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(abytVar2.a())));
                singletonList = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        abrc abrcVar = new abrc(this.a);
        long j2 = this.b;
        abrg abrgVar2 = abrcVar.i;
        abyi abyiVar = new abyi(abrgVar2, abmr.o(singletonList), j2);
        abrgVar2.b(abyiVar);
        abhg.o(abyiVar);
    }
}
