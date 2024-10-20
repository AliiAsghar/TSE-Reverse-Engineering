package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rti {
    public final int a;
    public final SelfIdentityId b;
    public final Uri c;
    public final String d;
    public final int e;
    public final String f;
    private final Uri g;

    public rti() {
        throw null;
    }

    public static rti a(Context context, int i, String str, int i2, int i3, SelfIdentityId selfIdentityId, String str2) {
        String str3;
        int ba;
        Locale f = dzf.c(context.getResources().getConfiguration()).f(0);
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(f, "%d", valueOf);
        if (TextUtils.isEmpty(str)) {
            str3 = context.getString(R.string.sim_slot_identifier, valueOf);
        } else {
            str3 = str;
        }
        if (i2 == 0) {
            ba = context.getColor(R.color.sim_icon_text_color);
        } else {
            context.getClass();
            ba = adom.ba(context, i2);
        }
        int i4 = ba;
        return new rti(i3, selfIdentityId, xvc.t(context, format, false, i4), xvc.t(context, format, true, i4), str3, i4, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rti) {
            rti rtiVar = (rti) obj;
            if (this.a == rtiVar.a && this.b.equals(rtiVar.b) && this.c.equals(rtiVar.c) && this.g.equals(rtiVar.g) && this.d.equals(rtiVar.d) && this.e == rtiVar.e) {
                String str = this.f;
                String str2 = rtiVar.f;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode();
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode2 * 1000003) ^ this.e) * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "SelfIdentityEntry{subId=" + this.a + ", selfParticipantId=" + ((SelfIdentityIdImpl) this.b).a + ", iconUri=" + this.c.toString() + ", selectedIconUri=" + this.g.toString() + ", displayName=" + this.d + ", displayColor=" + this.e + ", displayDestination=" + this.f + "}";
    }

    public rti(int i, SelfIdentityId selfIdentityId, Uri uri, Uri uri2, String str, int i2, String str2) {
        this.a = i;
        this.b = selfIdentityId;
        if (uri == null) {
            throw new NullPointerException("Null iconUri");
        }
        this.c = uri;
        if (uri2 != null) {
            this.g = uri2;
            if (str != null) {
                this.d = str;
                this.e = i2;
                this.f = str2;
                return;
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null selectedIconUri");
    }
}
