package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajm extends BaseAdapter {
    public alog a;
    public final yep b;
    public final Map c;
    public final Consumer d;
    public final atsg e;
    private final LayoutInflater f;

    public aajm(yep yepVar, atsg atsgVar, Consumer consumer, Context context) {
        this.f = LayoutInflater.from(context);
        this.a = DebugGServiceKeysFragment.d(atsgVar);
        this.b = yepVar;
        this.e = atsgVar;
        this.d = consumer;
        this.c = yepVar.f();
    }

    public final void a(String str, String str2, String str3) {
        DebugGServiceKeysFragment.a(str).ifPresentOrElse(new zcd(this, str3, 9), new vri(str2, str, str3, 19, (int[]) null));
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugGServiceKeysItemView debugGServiceKeysItemView;
        if (view instanceof DebugGServiceKeysItemView) {
            debugGServiceKeysItemView = (DebugGServiceKeysItemView) view;
        } else {
            debugGServiceKeysItemView = (DebugGServiceKeysItemView) this.f.inflate(R.layout.debug_gservicekeys_item_view, viewGroup, false);
        }
        String str = (String) this.a.get(i);
        DebugGServiceKeysFragment.a(str).ifPresentOrElse(new aakk(this, debugGServiceKeysItemView, str, 1), new vri(this, debugGServiceKeysItemView, str, 20, (int[]) null));
        return debugGServiceKeysItemView;
    }
}
