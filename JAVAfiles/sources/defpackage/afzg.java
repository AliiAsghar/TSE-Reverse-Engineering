package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzg extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzg(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v92, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i;
        boolean isInMultiWindowMode;
        agar agarVar;
        agaq agaqVar;
        int i2;
        int statusBars;
        Insets insets;
        boolean z = true;
        aiim aiimVar = null;
        Integer num = null;
        armf armfVar = null;
        Optional optional = null;
        switch (this.b) {
            case 0:
                List list = ((afzh) this.a).a;
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afsx) it.next()).a());
                }
                return (String[]) arrayList.toArray(new String[0]);
            case 1:
                aiim aiimVar2 = ((afzd) this.a).p;
                if (aiimVar2 == null) {
                    arro.b("draftControllerFactory");
                } else {
                    aiimVar = aiimVar2;
                }
                return aiimVar.o((EditText) this.a);
            case 2:
                Optional optional2 = ((agai) this.a).aK;
                if (optional2 == null) {
                    arro.b("providedConfiguration");
                } else {
                    optional = optional2;
                }
                Optional map = optional.map(new admk(afob.s, 19));
                map.getClass();
                agaj agajVar = (agaj) arsd.j(map, ((agai) this.a).aG);
                if (agajVar != null) {
                    return agajVar;
                }
                Object obj = this.a;
                int i3 = arsc.a;
                throw new IllegalStateException("Configuration wasn't provided for " + new arrh(obj.getClass()).c() + ", which had no default value");
            case 3:
                agaj bk = ((agai) this.a).bk();
                if (bk == null) {
                    return ((agai) this.a).bi();
                }
                return bk;
            case 4:
                if (((agai) this.a).gD()) {
                    return ascy.a(((agai) this.a).bj());
                }
                throw new IllegalStateException("Check failed.");
            case 5:
                armf armfVar2 = ((agai) this.a).aI;
                if (armfVar2 == null) {
                    arro.b("tracingProvider");
                } else {
                    armfVar = armfVar2;
                }
                return (afke) armfVar.b();
            case 6:
                agap agapVar = (agap) this.a;
                agapVar.e = arrn.J(agapVar.c, null, null, new wio(agapVar, (arpe) null, 10), 3);
                return arnb.a;
            case 7:
                return (Boolean) arsd.j((Optional) this.a, false);
            case 8:
                View view = new View((Context) this.a);
                view.setTag("KEYBOARD_DETECTION");
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return view;
            case 9:
                PopupWindow popupWindow = new PopupWindow(new View((Context) this.a), 0, -1);
                popupWindow.setSoftInputMode(16);
                popupWindow.setInputMethodMode(1);
                return popupWindow;
            case 10:
                return (ViewGroup) ((Activity) this.a).findViewById(R.id.content);
            case 11:
                int i4 = ((agbp) this.a).c.getResources().getConfiguration().orientation;
                agbp agbpVar = (agbp) this.a;
                if (i4 != agbpVar.g) {
                    agbpVar.e.set(0, 0, 0, 0);
                }
                agbp agbpVar2 = (agbp) this.a;
                agbpVar2.g = i4;
                Rect rect = agbpVar2.e;
                int height = rect.height();
                agbpVar2.c.getWindowVisibleDisplayFrame(rect);
                int height2 = ((agbp) this.a).e.height();
                ((alvg) agbp.a.g().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener$onGlobalLayout$1", "invoke", 66, "KeyboardLayoutListener.kt")).u("onGlobalLayout: Height from %d to %d", height, height2);
                if (height != height2) {
                    agbo a = ((agbp) this.a).a();
                    int i5 = a.b;
                    if (height2 > i5) {
                        a.b = height2;
                        i5 = height2;
                    }
                    Integer valueOf = Integer.valueOf(i5 - height2);
                    if (valueOf.intValue() >= a.a) {
                        num = valueOf;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    agbp agbpVar3 = (agbp) this.a;
                    agbpVar3.f = i;
                    isInMultiWindowMode = agbpVar3.b.isInMultiWindowMode();
                    if (height == 0 && !isInMultiWindowMode) {
                        View view2 = ((agbp) this.a).c;
                        Context context = view2.getContext();
                        context.getClass();
                        int i6 = afzv.c(context).y;
                        if (Build.VERSION.SDK_INT > 29) {
                            WindowInsets rootWindowInsets = view2.getRootWindowInsets();
                            statusBars = WindowInsets.Type.statusBars();
                            insets = rootWindowInsets.getInsets(statusBars);
                            i2 = insets.top;
                        } else {
                            Context context2 = view2.getContext();
                            context2.getClass();
                            int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                            if (identifier > 0) {
                                i2 = context2.getResources().getDimensionPixelSize(identifier);
                            } else {
                                i2 = 0;
                            }
                        }
                        int i7 = i6 - i2;
                        i = i7 - height2;
                        agbp agbpVar4 = (agbp) this.a;
                        if (i >= agbpVar4.d) {
                            agbpVar4.a().b = i7;
                        }
                    }
                    agbp agbpVar5 = (agbp) this.a;
                    if (i < agbpVar5.d) {
                        z = false;
                    }
                    agar agarVar2 = agbpVar5.h;
                    if (agarVar2 != null) {
                        if (z) {
                            agaqVar = agaq.a;
                        } else {
                            agaqVar = agaq.d;
                        }
                        agarVar2.m(agaqVar);
                    }
                    if (z && (agarVar = ((agbp) this.a).h) != null) {
                        agarVar.l(i);
                    }
                }
                return arnb.a;
            case 12:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((agcj) obj2).c.a();
                }
                return arnb.a;
            case 13:
                this.a.h(Boolean.valueOf(true));
                return arnb.a;
            case 14:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 15:
                return Integer.valueOf(this.a.size());
            case 16:
                this.a.a();
                return arnb.a;
            case 17:
                ((agdo) this.a).j();
                return arnb.a;
            case 18:
                return Long.valueOf(((agdu) this.a).c.getContext().getResources().getInteger(com.google.android.apps.messaging.R.integer.short_animation_ms));
            case 19:
                return ((RendererContainer) this.a).getChildAt(0);
            default:
                agem agemVar = ((aged) this.a).e;
                if (agemVar == null) {
                    return null;
                }
                return agemVar.gx();
        }
    }
}
