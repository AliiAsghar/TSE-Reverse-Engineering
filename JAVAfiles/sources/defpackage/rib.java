package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rib {
    public static final xze a = xze.g("BugleAction", "ActionSerializer");
    public final armf b;
    private final armf c;

    public rib(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.b = armfVar2;
    }

    public static String e(rhl rhlVar) {
        return rik.b(rhlVar.i());
    }

    private static Action f(String str, Parcel parcel) {
        try {
            Field field = Class.forName(str).getField("CREATOR");
            if (field.get(null) instanceof Parcelable.Creator) {
                Parcelable.Creator creator = (Parcelable.Creator) field.get(null);
                if (creator != null) {
                    return (Action) creator.createFromParcel(parcel);
                }
                throw new NoSuchFieldException(a.cp(str, "Failed to get CREATOR method of "));
            }
            throw new NoSuchFieldException(a.bW(str, "CREATOR of ", " isn't a Parcelable.Creator<? extends Action>"));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            xyo e2 = a.e();
            e2.H("Upgrade Exception when unparceling");
            e2.H(str);
            e2.z("Parcel", rik.c(parcel));
            e2.r(e);
            return null;
        }
    }

    public final Bundle a(Action action) {
        Bundle bundle = new Bundle();
        bundle.putString("bundle_action_name", action.getClass().getName());
        bundle.putString("bundle_action_key", action.t);
        bundle.putParcelable("bundle_action_params", action.u.i());
        return bundle;
    }

    public final Action b(String str, String str2, ActionParameters actionParameters) {
        Action action = null;
        if (TextUtils.isEmpty(str)) {
            a.q("No className found when unparceling action. Must be parceled via old way.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            xyo e = a.e();
            e.H("No key found when unparceling");
            e.H(str);
            e.H(". Must be parceled via old way.");
            e.q();
            return null;
        }
        if (actionParameters == null) {
            xyo e2 = a.e();
            e2.H("No Params found when unparceling");
            e2.H(str);
            e2.H(". Must be parceled via old way.");
            e2.q();
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeString(str2);
                obtain.writeParcelable(actionParameters, 0);
                obtain.setDataPosition(0);
                try {
                    armf armfVar = (armf) ((Map) ((apxx) this.c).a).get(Class.forName(str));
                    if (armfVar == null) {
                        xyo d = a.d();
                        d.H("No className found when unparceling");
                        d.H(str);
                        d.u(". Must be parceled via old way.");
                        d.q();
                    } else {
                        action = ((rhp) armfVar.b()).c(obtain);
                    }
                } catch (ClassNotFoundException e3) {
                    xyo d2 = a.d();
                    d2.H("No className found when unparceling");
                    d2.H(str);
                    d2.u(". Must be parceled via old way.");
                    d2.r(e3);
                }
                if (action != null) {
                    return action;
                }
                Action f = f(str, obtain);
                xyl.l(f);
                return f;
            } catch (RuntimeException e4) {
                e4.addSuppressed(new RuntimeException(a.cg(rik.c(obtain), str, "Unexpected Exception when unparceling ", " with parcel ")));
                throw e4;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final Action c(Bundle bundle) {
        Action b = b(bundle.getString("bundle_action_name"), bundle.getString("bundle_action_key"), (ActionParameters) bundle.getParcelable("bundle_action_params"));
        if (b != null) {
            return b;
        }
        return (Action) bundle.getParcelable("bundle_action");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action d(android.os.PersistableBundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "bundle_action_name"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "bundle_action_key"
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "bundle_action_serialized_params"
            java.lang.String r2 = r8.getString(r2)
            r3 = 0
            if (r0 != 0) goto L1e
            xze r0 = defpackage.rib.a
            java.lang.String r1 = "No className found when unparceling action. Must be parceled via old way."
            r0.q(r1)
        L1c:
            r0 = r3
            goto L8a
        L1e:
            if (r1 != 0) goto L28
            xze r0 = defpackage.rib.a
            java.lang.String r1 = "No key found when unparceling action. Must be parceled via old way."
            r0.q(r1)
            goto L1c
        L28:
            armf r4 = r7.b
            java.lang.Object r4 = r4.b()
            nhy r4 = (defpackage.nhy) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L71
            java.lang.String r4 = "persistable_bundle_action_params"
            android.os.PersistableBundle r4 = r8.getPersistableBundle(r4)
            j$.util.Optional r4 = j$.util.Optional.ofNullable(r4)
            rhr r5 = new rhr
            r6 = 6
            r5.<init>(r6)
            j$.util.Optional r4 = r4.map(r5)
            rhr r5 = new rhr
            r6 = 7
            r5.<init>(r6)
            j$.util.Optional r4 = r4.map(r5)
            mau r5 = new mau
            r6 = 13
            r5.<init>(r2, r0, r6, r3)
            j$.util.Optional r2 = r4.or(r5)
            kzr r4 = new kzr
            r5 = 11
            r4.<init>(r7, r0, r1, r5)
            j$.util.Optional r0 = r2.map(r4)
            java.lang.Object r0 = r0.orElse(r3)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r0
            goto L8a
        L71:
            if (r2 != 0) goto L7b
            xze r0 = defpackage.rib.a
            java.lang.String r1 = "No byteString found when unparceling action. Must be parceled via old way."
            r0.q(r1)
            goto L1c
        L7b:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters> r4 = com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters.class
            java.lang.Object r2 = defpackage.rik.a(r2, r4, r0)
            com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters r2 = (com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters) r2
            if (r2 != 0) goto L86
            goto L1c
        L86:
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r7.b(r0, r1, r2)
        L8a:
            if (r0 != 0) goto La8
            java.lang.String r0 = "action_parcel"
            java.lang.String r8 = r8.getString(r0)
            if (r8 != 0) goto L9c
            xze r8 = defpackage.rib.a
            java.lang.String r0 = "No bytes found when unparceling action the old way"
            r8.q(r0)
            goto La7
        L9c:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.Action> r0 = com.google.android.apps.messaging.shared.datamodel.action.common.Action.class
            java.lang.String r1 = "Action"
            java.lang.Object r8 = defpackage.rik.a(r8, r0, r1)
            r3 = r8
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r3 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r3
        La7:
            return r3
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rib.d(android.os.PersistableBundle):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}
