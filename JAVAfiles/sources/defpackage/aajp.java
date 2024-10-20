package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajp extends BaseAdapter {
    public final xbe a;
    public final xan b;
    public final Map c;
    private final LayoutInflater d;
    private final List e;
    private final int f;
    private final yyz g;

    public aajp(xbf xbfVar, xan xanVar, yyz yyzVar, Context context, int i, boolean z) {
        this.d = LayoutInflater.from(context);
        this.a = xbfVar.a(i);
        this.f = i;
        this.g = yyzVar;
        this.b = xanVar;
        TreeMap m = yyzVar.m(i, z);
        this.c = m;
        ArrayList arrayList = new ArrayList(m.keySet());
        this.e = arrayList;
        arrayList.add(0, "How do I use this debug tool?");
    }

    public final void a() {
        this.b.d.clear();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [armf, java.lang.Object] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugMmsConfigItemView debugMmsConfigItemView;
        Bundle c;
        if (view instanceof DebugMmsConfigItemView) {
            debugMmsConfigItemView = (DebugMmsConfigItemView) view;
        } else {
            debugMmsConfigItemView = (DebugMmsConfigItemView) this.d.inflate(R.layout.debug_mmsconfig_item_view, viewGroup, false);
        }
        String str = (String) this.e.get(i);
        if (str.equals("How do I use this debug tool?")) {
            debugMmsConfigItemView.d = str;
            debugMmsConfigItemView.a.setText(str);
        } else {
            xas xasVar = (xas) this.c.get(str);
            if (xasVar != null) {
                yyz yyzVar = this.g;
                int i2 = this.f;
                TreeMap treeMap = new TreeMap();
                treeMap.put(xar.DEFAULTS, String.valueOf(d.ax().get(str)));
                xan xanVar = (xan) yyzVar.f.b();
                xanVar.getClass();
                Bundle bundle = new Bundle();
                if (((znj) yyzVar.b.b()).W()) {
                    bundle = ((xbo) yyzVar.l.b()).a(i2);
                } else {
                    xanVar.d(i2, bundle, R.xml.mms_config);
                }
                treeMap.put(xar.BUGLE_MMS_CONFIG, String.valueOf(bundle.get(str)));
                Bundle bundle2 = new Bundle();
                if (((znj) yyzVar.b.b()).W()) {
                    bundle2 = ((xbo) yyzVar.e.b()).a(i2);
                }
                treeMap.put(xar.OEM_SPECIFIC_OVERRIDE, String.valueOf(bundle2.getString(str)));
                if (((znj) yyzVar.b.b()).W()) {
                    c = ((xbt) yyzVar.a.b()).a(i2);
                } else {
                    c = xan.c(i2, (yjy) yyzVar.j.b());
                }
                if (c != null) {
                    treeMap.put(xar.PLATFORM, String.valueOf(c.get(str)));
                } else {
                    treeMap.put(xar.PLATFORM, "null");
                }
                if (((znj) yyzVar.b.b()).W()) {
                    treeMap.put(xar.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG, String.valueOf(((xbg) yyzVar.i.b()).a(i2).get(str)));
                } else {
                    treeMap.put(xar.SERVER_SIDE_OVERRIDE_PHENOTYPE, String.valueOf(xanVar.b(xbn.a).get(str)));
                    if (((Boolean) xan.b.e()).booleanValue()) {
                        treeMap.put(xar.EXPERIMENT_OVERRIDE, String.valueOf(xanVar.b(xan.c).get(str)));
                    } else {
                        treeMap.put(xar.EXPERIMENT_OVERRIDE, "null");
                    }
                }
                treeMap.put(xar.USER_SETTING, String.valueOf(yyzVar.k(i2).get(str)));
                debugMmsConfigItemView.i = this;
                debugMmsConfigItemView.d = str;
                Object obj = xasVar.a;
                debugMmsConfigItemView.h = yyb.cQ(obj);
                Context context = debugMmsConfigItemView.getContext();
                debugMmsConfigItemView.f = "(" + xasVar.b.j + ") " + str;
                debugMmsConfigItemView.a.setText(debugMmsConfigItemView.f);
                StringBuilder sb = new StringBuilder("\n");
                for (Map.Entry entry : treeMap.entrySet()) {
                    sb.append("(");
                    sb.append(((xar) entry.getKey()).j);
                    sb.append(") ");
                    sb.append(((xar) entry.getKey()).toString().toLowerCase(yhx.b(context)));
                    sb.append(" :  ");
                    sb.append((String) entry.getValue());
                    sb.append("\n");
                }
                debugMmsConfigItemView.g = sb.toString();
                String cS = yyb.cS(obj, debugMmsConfigItemView.h);
                int i3 = debugMmsConfigItemView.h;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5) {
                                debugMmsConfigItemView.b.setVisibility(8);
                                debugMmsConfigItemView.c.setVisibility(8);
                                xzb.g("Bugle", "Unexpected keytype: " + yyb.cP(debugMmsConfigItemView.h) + " key: " + str);
                            }
                        } else {
                            debugMmsConfigItemView.c.setVisibility(0);
                            debugMmsConfigItemView.b.setVisibility(8);
                            debugMmsConfigItemView.c.setChecked(Boolean.parseBoolean(cS));
                        }
                    }
                    debugMmsConfigItemView.b.setVisibility(0);
                    debugMmsConfigItemView.c.setVisibility(8);
                    debugMmsConfigItemView.b.setText(cS);
                    debugMmsConfigItemView.b.setMaxWidth(500);
                } else {
                    throw null;
                }
            }
        }
        return debugMmsConfigItemView;
    }
}
