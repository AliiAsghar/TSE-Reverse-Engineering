package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentContainerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyl extends arrp implements arqr {
    final /* synthetic */ afzr a;
    final /* synthetic */ afyo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyl(afzr afzrVar, afyo afyoVar) {
        super(1);
        this.a = afzrVar;
        this.b = afyoVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cj cjVar;
        da a;
        agfh agfhVar;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
        fragmentContainerView.getClass();
        cg f = da.f(fragmentContainerView);
        View view = null;
        if (f != null) {
            if (f.aw()) {
                a = f.G();
            } else {
                throw new IllegalStateException(a.ce(fragmentContainerView, f, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
            }
        } else {
            Context context = fragmentContainerView.getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof cj) {
                        cjVar = (cj) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    cjVar = null;
                    break;
                }
            }
            if (cjVar != null) {
                a = cjVar.a();
            } else {
                throw new IllegalStateException(a.cc(fragmentContainerView, "View ", " is not within a subclass of FragmentActivity."));
            }
        }
        HugoHostFragment hugoHostFragment = (HugoHostFragment) a.d(fragmentContainerView.getId());
        if (hugoHostFragment != null) {
            afzr afzrVar = this.a;
            afyo afyoVar = this.b;
            if (afzrVar != null && hugoHostFragment.aj != null) {
                ((alvg) HugoHostFragment.a.d().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "applyHugoColors", 84, "HugoHostFragment.kt")).t("Applying HugoColors: %s", afzrVar);
                afxy afxyVar = hugoHostFragment.aj;
                if (afxyVar == null) {
                    arro.b("hugoManager");
                    afxyVar = null;
                }
                ((alvg) agdo.b.g().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "onHugoColorsChanged", 91, "RenderingManager.kt")).q("HugoColors changed");
                agdo agdoVar = ((afye) afxyVar).i;
                agem d = agdoVar.d();
                if (d != null) {
                    d.bv(afzrVar);
                }
                agdoVar.c.k = afzrVar;
            }
            hugoHostFragment.ag = afyoVar.b;
            hugoHostFragment.ah = afyoVar.c;
            agfn agfnVar = afyoVar.a;
            if (hugoHostFragment.ag != null) {
                Integer num = hugoHostFragment.al;
                if (hugoHostFragment.e().c && num != null) {
                    ((alvg) HugoHostFragment.a.g().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "display", 71, "HugoHostFragment.kt")).q("Updating height since view now has parent.");
                    View view2 = hugoHostFragment.Q;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = num.intValue();
                            view2.setLayoutParams(layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    hugoHostFragment.al = null;
                }
                boolean z = agfnVar instanceof agfk;
                if (z) {
                    agfhVar = ((agfk) agfnVar).a;
                } else {
                    if (agfnVar instanceof agfl) {
                        agfl agflVar = (agfl) agfnVar;
                        for (agfh agfhVar2 : agflVar.a) {
                            if (agfhVar2.a == agflVar.b) {
                                agfhVar = agfhVar2;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    agfhVar = null;
                }
                if (agfhVar != null) {
                    hugoHostFragment.ai = agfhVar.c;
                }
                afxy afxyVar2 = hugoHostFragment.aj;
                if (afxyVar2 == null) {
                    arro.b("hugoManager");
                    afxyVar2 = null;
                }
                afye afyeVar = (afye) afxyVar2;
                afyeVar.g.f(agfnVar);
                if (z) {
                    agfh agfhVar3 = ((agfk) agfnVar).a;
                    agen agenVar = agfhVar3.b;
                    if (agenVar != null) {
                        afyeVar.n(agfhVar3.a, agenVar);
                    }
                    afyeVar.k(agfhVar3.a);
                } else if (agfnVar instanceof agfl) {
                    agfl agflVar2 = (agfl) agfnVar;
                    for (agfh agfhVar4 : agflVar2.a) {
                        agek agekVar = agfhVar4.a;
                        agen agenVar2 = agfhVar4.b;
                        if (agenVar2 != null) {
                            afyeVar.n(agekVar, agenVar2);
                        }
                    }
                    List list = agflVar2.a;
                    ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((agfh) it.next()).a);
                    }
                    afyeVar.m(arrayList, agflVar2.b, agflVar2.c);
                } else if (agfnVar instanceof agfj) {
                    View view3 = ((agfj) agfnVar).a;
                    if (afyeVar.f.c() != agaq.d && afyeVar.f.c() != agaq.c) {
                        if (afyeVar.e.c() != agdp.d) {
                            ((alvg) afye.b.f().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 505, "HugoManagerImpl.kt")).q("Keyboard showing above input, closing input.");
                            afyeVar.e();
                            if (view3 != null) {
                                if (true != view3.hasFocus()) {
                                    view = view3;
                                }
                                if (view != null) {
                                    view.requestFocus();
                                }
                            }
                        } else {
                            ((alvg) afye.b.f().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 510, "HugoManagerImpl.kt")).t("Keyboard already only input open (%s).", afyeVar.f.c());
                        }
                    } else {
                        ((alvg) afye.b.f().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "ensureOnlyKeyboardOpen", 501, "HugoManagerImpl.kt")).q("Keyboard not visible, attempting to open.");
                        if (view3 != null) {
                            afyeVar.c.f(view3, false);
                        } else {
                            afyeVar.c.j();
                        }
                    }
                } else if (agfnVar instanceof agfi) {
                    agfi agfiVar = (agfi) agfnVar;
                    afxe afxeVar = agfiVar.b;
                    if (afxeVar != null) {
                        afyeVar.n(agek.e, afxeVar);
                    }
                    afyeVar.l(agfiVar.a);
                } else if (agfnVar instanceof agfg) {
                    afyeVar.e();
                } else {
                    throw new armm();
                }
            } else {
                throw new IllegalArgumentException("DraftController must be set before input display");
            }
        }
        return arnb.a;
    }
}
