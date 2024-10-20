package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.reflection.Consumer2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqc implements gpo {
    public static volatile gqc a;
    public static final ReentrantLock b = new ReentrantLock();
    public final Context c;
    public final CopyOnWriteArrayList d;
    public final gpx e;
    private final gqb f;

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, androidx.window.extensions.embedding.ActivityEmbeddingComponent] */
    public gqc(Context context, final gpx gpxVar) {
        this.c = context;
        this.e = gpxVar;
        final gqb gqbVar = new gqb(this);
        this.f = gqbVar;
        this.d = new CopyOnWriteArrayList();
        if (gpxVar != null) {
            int i = ((xzg) gpxVar.d).a;
            if (i == 1) {
                Object obj = gpxVar.c;
                Object obj2 = gpxVar.a;
                int i2 = arsc.a;
                goq goqVar = (goq) obj;
                obj2.getClass().getMethod("setSplitInfoCallback", goqVar.b()).invoke(obj2, goqVar.c(new arrh(List.class), new geg(gqbVar, gpxVar, 2)));
            } else if (i >= 2 && i < 5) {
                gpxVar.a(gqbVar);
            } else if (i >= 5) {
                gpxVar.a(gqbVar);
                gpxVar.a.registerActivityStackCallback(new sp(6), new Consumer2() { // from class: gpu
                    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj3) {
                        List list = (List) obj3;
                        gpz.this.getClass();
                        gpxVar.getClass();
                        list.getClass();
                        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(gph.b(ry$$ExternalSyntheticApiModelOutline0.m467m(it.next())));
                        }
                    }
                });
            }
        }
        new to((byte[]) null);
        new HashMap();
        armd.a(new gov(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.window.extensions.embedding.ActivityEmbeddingComponent] */
    @Override // defpackage.gpo
    public final boolean a(Activity activity) {
        boolean isActivityEmbedded;
        gpx gpxVar = this.e;
        if (gpxVar == null) {
            return false;
        }
        isActivityEmbedded = gpxVar.a.isActivityEmbedded(activity);
        return isActivityEmbedded;
    }
}
