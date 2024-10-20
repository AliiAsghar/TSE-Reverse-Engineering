package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aafh implements arqg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ aafh(aafk aafkVar, SuggestionData suggestionData, aafw aafwVar, LinearLayout linearLayout, int i) {
        this.e = i;
        this.a = aafkVar;
        this.b = suggestionData;
        this.c = aafwVar;
        this.d = linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, aafw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData] */
    @Override // defpackage.arqg
    public final Object a() {
        if (this.e != 0) {
            String uuid = ((UUID) this.c).toString();
            had hadVar = (had) this.a;
            gys b = hadVar.b.b(uuid);
            Object obj = this.b;
            if (b != null && !b.d.a()) {
                gxn gxnVar = hadVar.a;
                synchronized (((gud) gxnVar).j) {
                    gsy.a();
                    Log.i(gud.a, a.bW(uuid, "Moving WorkSpec (", ") to the foreground"));
                    lhm lhmVar = (lhm) ((gud) gxnVar).f.remove(uuid);
                    if (lhmVar != null) {
                        if (((gud) gxnVar).b == null) {
                            ((gud) gxnVar).b = haa.a(((gud) gxnVar).c, "ProcessorForegroundLck");
                            ((gud) gxnVar).b.acquire();
                        }
                        ((gud) gxnVar).e.put(uuid, lhmVar);
                        Context context = ((gud) gxnVar).c;
                        gyg e = lhmVar.e();
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_START_FOREGROUND");
                        intent.putExtra("KEY_WORKSPEC_ID", e.a);
                        intent.putExtra("KEY_GENERATION", e.b);
                        intent.putExtra("KEY_NOTIFICATION_ID", ((gsp) obj).a);
                        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((gsp) obj).b);
                        intent.putExtra("KEY_NOTIFICATION", ((gsp) obj).c);
                        ((gud) gxnVar).c.startForegroundService(intent);
                    }
                }
                Object obj2 = this.d;
                gyg J = gvf.J(b);
                Context context2 = (Context) obj2;
                Intent intent2 = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent2.setAction("ACTION_NOTIFY");
                gsp gspVar = (gsp) obj;
                intent2.putExtra("KEY_NOTIFICATION_ID", gspVar.a);
                intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gspVar.b);
                intent2.putExtra("KEY_NOTIFICATION", gspVar.c);
                intent2.putExtra("KEY_WORKSPEC_ID", J.a);
                intent2.putExtra("KEY_GENERATION", J.b);
                context2.startService(intent2);
                return null;
            }
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        Object obj3 = this.a;
        aksr aksrVar = ((aafk) obj3).q;
        Object obj4 = this.d;
        ?? r3 = this.c;
        ?? r4 = this.b;
        akrc b2 = aksrVar.b("ConversationSuggestionsController#onClick");
        try {
            ((aafk) obj3).h(r4, r3, (View) obj4);
            b2.close();
            return arnb.a;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ aafh(had hadVar, UUID uuid, gsp gspVar, Context context, int i) {
        this.e = i;
        this.a = hadVar;
        this.c = uuid;
        this.b = gspVar;
        this.d = context;
    }
}
