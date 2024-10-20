package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class woc implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ woc(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = true;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                wod.a.r("Could not save Verified SMS token", (Throwable) obj);
                return false;
            case 1:
                return true;
            case 2:
                xze xzeVar = woe.a;
                return null;
            case 3:
                xze xzeVar2 = woe.a;
                return null;
            case 4:
                return Long.valueOf(((woo) obj).d);
            case 5:
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                alwo alwoVar = wub.a;
                if (imsCapabilities.c) {
                    return psy.ONLINE;
                }
                int i = imsCapabilities.g;
                if (i != 404) {
                    if (i != 604) {
                        return psy.OFFLINE;
                    }
                    return psy.UNKNOWN;
                }
                return psy.NOT_RCS;
            case 6:
                alwo alwoVar2 = wub.a;
                return psv.b(((ImsCapabilities) obj).i);
            case 7:
                return Boolean.valueOf(((lzn) obj).c);
            case 8:
                return Boolean.valueOf(((lzn) obj).d);
            case 9:
                aozy builder = ((lzn) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                lzn lznVar = (lzn) builder.b;
                lznVar.b |= 4;
                lznVar.d = false;
                return (lzn) builder.s();
            case 10:
                aozy builder2 = ((lzn) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                lzn lznVar2 = (lzn) builder2.b;
                lznVar2.b |= 2;
                lznVar2.c = true;
                return (lzn) builder2.s();
            case 11:
                xze xzeVar3 = xac.c;
                return xaa.FIRST_FULL_SYNC;
            case 12:
                xze xzeVar4 = xac.c;
                return xaa.FIRST_FULL_SYNC;
            case 13:
                xze xzeVar5 = xac.c;
                return (UUID) ((Optional) obj).map(new wmi(14)).orElseGet(new wso(10));
            case 14:
                xac.c.r("Failed to update first full sync timestamp", (IOException) obj);
                return xaa.FAILED_TO_UPDATE_TIMESTAMP;
            case 15:
                apwq V = ((MessageCoreData) obj).V();
                if (V == null) {
                    return apwq.a;
                }
                return V;
            case 16:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                apwq apwqVar = apwq.a;
                if (((Boolean) ((utz) yig.U.get()).e()).booleanValue() && messageCoreData.cr()) {
                    Optional Y = messageCoreData.Y();
                    if (Y.isPresent()) {
                        apwqVar = vom.i(apwqVar, (xwb) Y.get());
                    }
                    return vom.h(apwqVar);
                }
                return apwqVar;
            case 17:
                return Long.valueOf(((xbu) obj).c);
            case 18:
                xbu xbuVar = (xbu) obj;
                int i2 = xbw.c;
                String str = xbuVar.d;
                apct apctVar = xbuVar.e;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                Instant l = aotl.l(apctVar);
                apct apctVar2 = xbuVar.f;
                if (apctVar2 == null) {
                    apctVar2 = apct.a;
                }
                return xbw.c(str).map(new uzn(l, aotl.l(apctVar2), 7, bArr));
            case 19:
                if (((akip) obj).a) {
                    xyo e = xcj.a.e();
                    e.H("onApplicationCreated startup tasks were not enqueued before onAppInteractive, executed in onAppInteractive().");
                    e.q();
                }
                return null;
            default:
                return new akip(z);
        }
    }
}
