package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acox {
    public String a;
    public Optional b;
    public acoy c;
    public acpb d;
    public Optional e;
    public acow f;
    public Optional g;
    public List h;
    public Optional i;
    public final String j;
    public acpg k;

    public acox(acox acoxVar) {
        this.b = Optional.empty();
        this.c = acoy.NONE;
        this.d = acpb.UNKNOWN;
        this.e = Optional.empty();
        this.f = acow.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.c = acoxVar.c;
        this.f = acoxVar.f;
        this.k = acoxVar.k;
        this.j = acoxVar.j;
    }

    public final void a(acox acoxVar) {
        if (acoxVar.b()) {
            if (acoxVar.k == acpg.FULL) {
                this.i = acoxVar.i;
                this.g = acoxVar.g;
                this.f = acoxVar.f;
                this.a = acoxVar.a;
                this.e = acoxVar.e;
                this.d = acoxVar.d;
                this.h = acoxVar.h;
                this.b = acoxVar.b;
                this.c = acoxVar.c;
                return;
            }
            acpg acpgVar = acoxVar.k;
            if (acpgVar == acpg.PARTIAL) {
                if (acoxVar.i.isPresent()) {
                    this.i = acoxVar.i;
                }
                if (acoxVar.g.isPresent()) {
                    this.g = acoxVar.g;
                }
                if (acoxVar.f != acow.UNKNOWN) {
                    this.f = acoxVar.f;
                }
                String str = acoxVar.a;
                if (str != null) {
                    this.a = str;
                }
                if (acoxVar.e.isPresent()) {
                    this.e = acoxVar.e;
                }
                if (acoxVar.d != acpb.UNKNOWN) {
                    this.d = acoxVar.d;
                }
                this.h.clear();
                this.h.addAll(acoxVar.h);
                if (acoxVar.b.isPresent()) {
                    this.b = acoxVar.b;
                }
                if (acoxVar.c != acoy.NONE) {
                    this.c = acoxVar.c;
                    return;
                }
                return;
            }
            acpg acpgVar2 = acpg.DELETED;
            if (acpgVar == acpgVar2) {
                this.k = acpgVar2;
            }
        }
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.j)) {
            return false;
        }
        if (this.k == acpg.NONE) {
            advr.q("Invalid endpoint. State is NONE.", new Object[0]);
            return false;
        }
        if (this.k == acpg.FULL && this.c == acoy.NONE) {
            advr.q("Invalid endpoint. Full state does not have a status.", new Object[0]);
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acox)) {
            return false;
        }
        acox acoxVar = (acox) obj;
        if (!this.i.equals(acoxVar.i) || !this.g.equals(acoxVar.g) || this.f != acoxVar.f || !TextUtils.equals(this.a, acoxVar.a) || !TextUtils.equals(this.j, acoxVar.j) || !this.e.equals(acoxVar.e) || this.d != acoxVar.d || !this.h.equals(acoxVar.h) || !this.b.equals(acoxVar.b) || this.k != acoxVar.k || this.c != acoxVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.i, this.g, this.f, this.a, this.j, this.e, this.d, this.h, this.b, this.k, this.c});
    }

    public final String toString() {
        return "EndPoint [mDisplayText=" + advq.USER_ID.c(this.a) + ", mReferred=" + String.valueOf(this.b) + ", mStatus=" + String.valueOf(this.c) + ", mJoiningMethod=" + String.valueOf(this.d) + ", mJoiningInfo=" + String.valueOf(this.e) + ", mDisconnectionMethod=" + String.valueOf(this.f) + ", mDisconnectionInfo=" + String.valueOf(this.g) + ", mMedia=" + String.valueOf(this.h) + ", mCallinfo=" + String.valueOf(this.i) + ", mEntity=" + advq.USER_ID.c(this.j) + ", mState=" + String.valueOf(this.k) + ", mAnyAttr=]";
    }

    public acox(acpg acpgVar, String str) {
        this.b = Optional.empty();
        this.c = acoy.NONE;
        this.d = acpb.UNKNOWN;
        this.e = Optional.empty();
        this.f = acow.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.k = acpgVar;
        this.j = str;
    }
}
