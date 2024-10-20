package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvm implements agvi {
    private final List a;
    private final ahan b;
    private final Context c;
    private final ahjj d;

    public agvm(Context context, ahjj ahjjVar) {
        ahan ahanVar;
        ArrayList arrayList;
        this.c = context;
        this.d = ahjjVar;
        ahan.a aVar = ahan.a;
        if (ahbg.a()) {
            String str = true == TextUtils.isEmpty(null) ? "_private" : null;
            synchronized (ahan.class) {
                ahanVar = (ahan) ahan.d.get(str);
                if (ahanVar == null) {
                    ahanVar = new ahan(context.getApplicationContext(), str);
                    ahanVar.g();
                    ahan.d.put(str, ahanVar);
                }
            }
            this.b = ahanVar;
            String o = ahanVar.o("pref_key_recent_emoji");
            if (TextUtils.isEmpty(o)) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(anna.e(',').c(o));
            }
            this.a = arrayList;
            return;
        }
        throw new IllegalStateException("Private preferences should not be used before user unlocked");
    }

    @Override // defpackage.agvi
    public final ListenableFuture a() {
        return albo.bI(alog.n(this.a));
    }

    @Override // defpackage.agvj
    public final /* synthetic */ ListenableFuture b() {
        return aglo.A(this);
    }

    @Override // defpackage.agvj
    public final String c() {
        alvi alviVar = aguf.a;
        return this.c.getString(R.string.emoji_category_recent);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String sb;
        List list = this.a;
        if (list.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb = sb2.toString();
        }
        this.b.i("pref_key_recent_emoji", sb);
    }

    @Override // defpackage.agvj
    public final /* synthetic */ void d(agxy agxyVar) {
        aglo.B(this, agxyVar);
    }

    @Override // defpackage.agvi
    public final void e(String str) {
        this.a.remove(str);
        this.a.add(0, str);
        ((RecyclerView) this.d.a).P();
    }
}
