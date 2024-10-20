package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fg extends hw {
    public boolean a;
    public boolean b;
    final /* synthetic */ fo c;
    public qdq d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(fo foVar, Window.Callback callback) {
        super(callback);
        this.c = foVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a) {
            return this.e.dispatchKeyEvent(keyEvent);
        }
        if (!this.c.I(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            fo foVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            en b = foVar.b();
            if (b == null || !b.onKeyShortcut(keyCode, keyEvent)) {
                fm fmVar = foVar.E;
                if (fmVar != null && foVar.P(fmVar, keyEvent.getKeyCode(), keyEvent)) {
                    fm fmVar2 = foVar.E;
                    if (fmVar2 != null) {
                        fmVar2.l = true;
                    }
                } else {
                    if (foVar.E == null) {
                        fm O = foVar.O(0);
                        foVar.L(O, keyEvent);
                        boolean P = foVar.P(O, keyEvent.getKeyCode(), keyEvent);
                        O.k = false;
                        if (!P) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof ij)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        qdq qdqVar = this.d;
        if (qdqVar != null) {
            if (i == 0) {
                view = new View(((fv) qdqVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        en b;
        super.onMenuOpened(i, menu);
        if (i == 108 && (b = this.c.b()) != null) {
            b.dispatchMenuVisibilityChanged(true);
        }
        return true;
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        fo foVar = this.c;
        if (i == 108) {
            en b = foVar.b();
            if (b != null) {
                b.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            fm O = foVar.O(0);
            if (O.m) {
                foVar.B(O, false);
            }
        }
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ij ijVar;
        if (menu instanceof ij) {
            ijVar = (ij) menu;
        } else {
            ijVar = null;
        }
        if (i == 0) {
            if (ijVar == null) {
                return false;
            }
            i = 0;
        }
        if (ijVar != null) {
            ijVar.j = true;
        }
        qdq qdqVar = this.d;
        if (qdqVar != null && i == 0) {
            fv fvVar = (fv) qdqVar.a;
            if (!fvVar.b) {
                fvVar.c.g();
                ((fv) qdqVar.a).b = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (ijVar != null) {
            ijVar.j = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ij ijVar = this.c.O(0).h;
        if (ijVar != null) {
            super.onProvideKeyboardShortcuts(list, ijVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.hw, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ey eyVar;
        Context context;
        ey eyVar2;
        fo foVar = this.c;
        if (foVar.v && i == 0) {
            hp hpVar = new hp(foVar.k, callback);
            fo foVar2 = this.c;
            hm hmVar = foVar2.r;
            if (hmVar != null) {
                hmVar.f();
            }
            ff ffVar = new ff(foVar2, hpVar);
            en b = foVar2.b();
            if (b != null) {
                foVar2.r = b.startActionMode(ffVar);
                if (foVar2.r != null && (eyVar2 = foVar2.n) != null) {
                    eyVar2.gP();
                }
            }
            if (foVar2.r == null) {
                foVar2.D();
                hm hmVar2 = foVar2.r;
                if (hmVar2 != null) {
                    hmVar2.f();
                }
                if (foVar2.s == null) {
                    if (foVar2.C) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = foVar2.k.getTheme();
                        theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = foVar2.k.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new so(foVar2.k, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = foVar2.k;
                        }
                        foVar2.s = new ActionBarContextView(context);
                        foVar2.t = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                        foVar2.t.setWindowLayoutType(2);
                        foVar2.t.setContentView(foVar2.s);
                        foVar2.t.setWidth(-1);
                        context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                        foVar2.s.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                        foVar2.t.setHeight(-2);
                        foVar2.u = new bo(foVar2, 9, null);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) foVar2.x.findViewById(R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.a = LayoutInflater.from(foVar2.t());
                            foVar2.s = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (foVar2.s != null) {
                    foVar2.D();
                    foVar2.s.i();
                    ho hoVar = new ho(foVar2.s.getContext(), foVar2.s, ffVar);
                    if (ffVar.c(hoVar, hoVar.a)) {
                        hoVar.g();
                        foVar2.s.h(hoVar);
                        foVar2.r = hoVar;
                        if (foVar2.M()) {
                            foVar2.s.setAlpha(brg.a);
                            efu v = eek.v(foVar2.s);
                            v.e(1.0f);
                            foVar2.N = v;
                            foVar2.N.g(new fd(foVar2));
                        } else {
                            foVar2.s.setAlpha(1.0f);
                            foVar2.s.setVisibility(0);
                            if (foVar2.s.getParent() instanceof View) {
                                edx.c((View) foVar2.s.getParent());
                            }
                        }
                        if (foVar2.t != null) {
                            foVar2.l.getDecorView().post(foVar2.u);
                        }
                    } else {
                        foVar2.r = null;
                    }
                }
                if (foVar2.r != null && (eyVar = foVar2.n) != null) {
                    eyVar.gP();
                }
                foVar2.H();
            }
            foVar2.H();
            hm hmVar3 = foVar2.r;
            if (hmVar3 != null) {
                return hpVar.e(hmVar3);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
