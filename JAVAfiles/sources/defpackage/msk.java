package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface msk extends mre {
    public static final uuf a = uuh.i(uuh.b, "enable_messaging_identity_in_contact_picker", true);

    msh l();

    msh m();

    msh n(String str);

    msh o(ParticipantsTable.BindData bindData);

    msh p(String str);

    msh q(ParticipantsTable.BindData bindData);

    @Deprecated
    msh r(String str);

    msh s(ParticipantsTable.BindData bindData);

    msh t(String str, int i);

    msh u(msh mshVar);

    msh v(msh mshVar);

    alog w(List list);

    Optional x(ParticipantsTable.BindData bindData);

    alog y(aoia aoiaVar);
}
