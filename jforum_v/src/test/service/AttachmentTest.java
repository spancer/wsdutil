package test.service;

import static org.junit.Assert.fail;
import net.jforum.JForumExecutionContext;
import net.jforum.entities.Attachment;
import net.jforum.entities.QuotaLimit;
import net.jforum.util.preferences.SystemGlobals;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import test.AbstractSystemTest;

import com.godtips.service.AttachmentService;

/**
 * @desc 描述：
 *
 * @author weisd E-mail:weisd@junbao.net
 * @version 创建时间：2011-8-14 下午4:21:36
 */
public class AttachmentTest extends AbstractSystemTest{
	
	private static Logger logger = Logger.getLogger(AttachmentTest.class);

	@Autowired
	private AttachmentService attachmentService;

	@Test
	public void testAddAttachment() {

	}

	@Test
	public void testUpdateAttachment() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAttachment() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAttachments() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAttachmentById() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddQuotaLimit() {
		for (int i = 0; i < 10; i++) {
			QuotaLimit limit = new QuotaLimit();
			limit.setDescription("tsets" + i);
			limit.setId(i);
			limit.setSize(i);
			limit.setType(i);
			attachmentService.addQuotaLimit(limit);
		}
	}

	@Test
	public void testUpdateQuotaLimit() {
		for (int i = 0; i < 10; i++) {
			QuotaLimit limit = new QuotaLimit();
			limit.setDescription("update" + i);
			limit.setId(i);
			limit.setSize(i+1);
			limit.setType(i+1);
			attachmentService.updateQuotaLimit(limit);
		}
	}
		


	@Test
	public void testRemoveQuotaLimitInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveQuotaLimitStringArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGroupQuota() {
		fail("Not yet implemented");
	}

	@Test
	public void testCleanGroupQuota() {
		attachmentService.cleanGroupQuota();
	}

	@Test
	public void testSelectQuotaLimit() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectQuotaLimitByGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectGroupsQuotaLimits() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddExtensionGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateExtensionGroup() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveExtensionGroups() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectExtensionGroups() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtensionsForSecurity() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveExtensions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectExtensions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPhysicalDownloadMode() {
		fail("Not yet implemented");
	}

}
///**
// * @see net.jforum.dao.AttachmentDAO#addQuotaLimit(net.jforum.entities.QuotaLimit)
// */
//public void addQuotaLimit(QuotaLimit limit)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.addQuotaLimit"));
//		p.setString(1, limit.getDescription());
//		p.setInt(2, limit.getSize());
//		p.setInt(3, limit.getType());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//	
//	this.addObject("AttachmentModel.addQuotaLimit", limit);
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#updateQuotaLimit(net.jforum.entities.QuotaLimit)
// */
//public void updateQuotaLimit(QuotaLimit limit)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.updateQuotaLimit"));
//		p.setString(1, limit.getDescription());
//		p.setInt(2, limit.getSize());
//		p.setInt(3, limit.getType());
//		p.setInt(4, limit.getId());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#cleanGroupQuota()
// */
//public void cleanGroupQuota()
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.deleteGroupQuota"));
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#setGroupQuota(int, int)
// */
//public void setGroupQuota(int groupId, int quotaId)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.setGroupQuota"));
//		p.setInt(1, groupId);
//		p.setInt(2, quotaId);
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#removeQuotaLimit(int)
// */
//public void removeQuotaLimit(int id)
//{
//	this.removeQuotaLimit(new String[] { Integer.toString(id) });
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#removeQuotaLimit(java.lang.String[])
// */
//public void removeQuotaLimit(String[] ids)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.removeQuotaLimit"));
//
//		for (int i = 0; i < ids.length; i++) {
//			p.setInt(1, Integer.parseInt(ids[i]));
//			p.executeUpdate();
//		}
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectQuotaLimit()
// */
//public List selectQuotaLimit()
//{
//	List l = new ArrayList();
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectQuotaLimit"));
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			l.add(this.getQuotaLimit(rs));
//		}
//
//		return l;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectQuotaLimit()
// */
//public QuotaLimit selectQuotaLimitByGroup(int groupId)
//{
//	QuotaLimit ql = null;
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectQuotaLimitByGroup"));
//		p.setInt(1, groupId);
//
//		rs = p.executeQuery();
//		if (rs.next()) {
//			ql = this.getQuotaLimit(rs);
//		}
//		return ql;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectGroupsQuotaLimits()
// */
//public Map selectGroupsQuotaLimits()
//{
//	Map m = new HashMap();
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectGroupsQuotaLimits"));
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			m.put(new Integer(rs.getInt("group_id")), new Integer(rs.getInt("quota_limit_id")));
//		}
//
//		return m;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
//protected QuotaLimit getQuotaLimit(ResultSet rs) throws SQLException
//{
//	QuotaLimit ql = new QuotaLimit();
//	ql.setDescription(rs.getString("quota_desc"));
//	ql.setId(rs.getInt("quota_limit_id"));
//	ql.setSize(rs.getInt("quota_limit"));
//	ql.setType(rs.getInt("quota_type"));
//
//	return ql;
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#addExtensionGroup(net.jforum.entities.AttachmentExtensionGroup)
// */
//public void addExtensionGroup(AttachmentExtensionGroup g)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.addExtensionGroup"));
//		p.setString(1, g.getName());
//		p.setInt(2, g.isAllow() ? 1 : 0);
//		p.setString(3, g.getUploadIcon());
//		p.setInt(4, g.getDownloadMode());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#removeExtensionGroups(java.lang.String[])
// */
//public void removeExtensionGroups(String[] ids)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.removeExtensionGroups"));
//
//		for (int i = 0; i < ids.length; i++) {
//			p.setInt(1, Integer.parseInt(ids[i]));
//			p.executeUpdate();
//		}
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectExtensionGroups()
// */
//public List selectExtensionGroups()
//{
//	List l = new ArrayList();
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectExtensionGroups"));
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			l.add(this.getExtensionGroup(rs));
//		}
//
//		return l;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#extensionsForSecurity()
// */
//public Map extensionsForSecurity()
//{
//	Map m = new HashMap();
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.extensionsForSecurity"));
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			int allow = rs.getInt("group_allow");
//			if (allow == 1) {
//				allow = rs.getInt("allow");
//			}
//
//			m.put(rs.getString("extension"), Boolean.valueOf(allow == 1));
//		}
//
//		return m;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#updateExtensionGroup(net.jforum.entities.AttachmentExtensionGroup)
// */
//public void updateExtensionGroup(AttachmentExtensionGroup g)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.updateExtensionGroups"));
//		p.setString(1, g.getName());
//		p.setInt(2, g.isAllow() ? 1 : 0);
//		p.setString(3, g.getUploadIcon());
//		p.setInt(4, g.getDownloadMode());
//		p.setInt(5, g.getId());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
//protected AttachmentExtensionGroup getExtensionGroup(ResultSet rs) throws SQLException
//{
//	AttachmentExtensionGroup g = new AttachmentExtensionGroup();
//	g.setId(rs.getInt("extension_group_id"));
//	g.setName(rs.getString("name"));
//	g.setUploadIcon(rs.getString("upload_icon"));
//	g.setAllow(rs.getInt("allow") == 1);
//	g.setDownloadMode(rs.getInt("download_mode"));
//
//	return g;
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#addExtension(net.jforum.entities.AttachmentExtension)
// */
//public void addExtension(AttachmentExtension extension)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.addExtension"));
//		p.setInt(1, extension.getExtensionGroupId());
//		p.setString(2, extension.getComment());
//		p.setString(3, extension.getUploadIcon());
//		p.setString(4, extension.getExtension().toLowerCase());
//		p.setInt(5, extension.isAllow() ? 1 : 0);
//		p.executeUpdate();
//	}
//	catch (SQLException ex) {
//		throw new DatabaseException(ex);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#removeExtensions(java.lang.String[])
// */
//public void removeExtensions(String[] ids)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.removeExtension"));
//		for (int i = 0; i < ids.length; i++) {
//			p.setInt(1, Integer.parseInt(ids[i]));
//			p.executeUpdate();
//		}
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectExtensions()
// */
//public List selectExtensions()
//{
//	List l = new ArrayList();
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectExtensions"));
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			l.add(this.getExtension(rs));
//		}
//
//		return l;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#updateExtension(net.jforum.entities.AttachmentExtension)
// */
//public void updateExtension(AttachmentExtension extension)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.updateExtension"));
//		p.setInt(1, extension.getExtensionGroupId());
//		p.setString(2, extension.getComment());
//		p.setString(3, extension.getUploadIcon());
//		p.setString(4, extension.getExtension().toLowerCase());
//		p.setInt(5, extension.isAllow() ? 1 : 0);
//		p.setInt(6, extension.getId());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectExtension(java.lang.String)
// */
//public AttachmentExtension selectExtension(String extension)
//{
//	return this.searchExtension(SystemGlobals.getValue(ConfigKeys.EXTENSION_FIELD), extension);
//}
//
//private AttachmentExtension selectExtension(int extensionId)
//{
//	return this.searchExtension("extension_id", new Integer(extensionId));
//}
//
//private AttachmentExtension searchExtension(String paramName, Object paramValue)
//{
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		String sql = SystemGlobals.getSql("AttachmentModel.selectExtension");
//		sql = sql.replaceAll("\\$field", paramName);
//
//		p = JForumExecutionContext.getConnection().prepareStatement(sql);
//		p.setObject(1, paramValue);
//
//		AttachmentExtension e = new AttachmentExtension();
//
//		rs = p.executeQuery();
//		if (rs.next()) {
//			e = this.getExtension(rs);
//		}
//		else {
//			e.setUnknown(true);
//		}
//
//		return e;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
//protected AttachmentExtension getExtension(ResultSet rs) throws SQLException
//{
//	AttachmentExtension e = new AttachmentExtension();
//	e.setAllow(rs.getInt("allow") == 1);
//	e.setComment(rs.getString("description"));
//	e.setExtension(rs.getString("extension"));
//	e.setExtensionGroupId(rs.getInt("extension_group_id"));
//	e.setId(rs.getInt("extension_id"));
//
//	String icon = rs.getString("upload_icon");
//	if (icon == null || icon.equals("")) {
//		icon = rs.getString("group_icon");
//	}
//
//	e.setUploadIcon(icon);
//
//	return e;
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#addAttachment(net.jforum.entities.Attachment)
// */
//public void addAttachment(Attachment a)
//{
//	PreparedStatement p = null;
//	try {
//		p = this.getStatementForAutoKeys("AttachmentModel.addAttachment");
//		p.setInt(1, a.getPostId());
//		p.setInt(2, a.getPrivmsgsId());
//		p.setInt(3, a.getUserId());
//
//		this.setAutoGeneratedKeysQuery(SystemGlobals.getSql("AttachmentModel.lastGeneratedAttachmentId"));
//		int id = this.executeAutoKeysQuery(p);
//		p.close();
//		p = null;
//
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.addAttachmentInfo"));
//		p.setInt(1, id);
//		p.setString(2, a.getInfo().getPhysicalFilename());
//		p.setString(3, a.getInfo().getRealFilename());
//		p.setString(4, a.getInfo().getComment());
//		p.setString(5, a.getInfo().getMimetype());
//		p.setLong(6, a.getInfo().getFilesize());
//		p.setTimestamp(7, new Timestamp(a.getInfo().getUploadTimeInMillis()));
//		p.setInt(8, 0);
//		p.setInt(9, a.getInfo().getExtension().getId());
//		p.executeUpdate();
//
//		this.updatePost(a.getPostId(), 1);
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
//protected void updatePost(int postId, int count)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.updatePost"));
//		p.setInt(1, count);
//		p.setInt(2, postId);
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#removeAttachment(int, int)
// */
//public void removeAttachment(int id, int postId)
//{
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.removeAttachmentInfo"));
//		p.setInt(1, id);
//		p.executeUpdate();
//		p.close();
//		p = null;
//
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.removeAttachment"));
//		p.setInt(1, id);
//		p.executeUpdate();
//		p.close();
//		p = null;
//
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.countPostAttachments"));
//		p.setInt(1, postId);
//
//		rs = p.executeQuery();
//		if (rs.next()) {
//			this.updatePost(postId, rs.getInt(1));
//		}
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#updateAttachment(net.jforum.entities.Attachment)
// */
//public void updateAttachment(Attachment a)
//{
//	PreparedStatement p = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.updateAttachment"));
//		p.setString(1, a.getInfo().getComment());
//		p.setInt(2, a.getInfo().getDownloadCount());
//		p.setInt(3, a.getId());
//		p.executeUpdate();
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(p);
//	}
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectAttachments(int)
// */
//public List selectAttachments(int postId)
//{
//	List l = new ArrayList();
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectAttachments"));
//		p.setInt(1, postId);
//
//		rs = p.executeQuery();
//		while (rs.next()) {
//			l.add(this.getAttachment(rs));
//		}
//
//		return l;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
//protected Attachment getAttachment(ResultSet rs) throws SQLException
//{
//	Attachment a = new Attachment();
//	a.setId(rs.getInt("attach_id"));
//	a.setPostId(rs.getInt("post_id"));
//	a.setPrivmsgsId(rs.getInt("privmsgs_id"));
//
//	AttachmentInfo ai = new AttachmentInfo();
//	ai.setComment(rs.getString("description"));
//	ai.setDownloadCount(rs.getInt("download_count"));
//	ai.setFilesize(rs.getLong("filesize"));
//	ai.setMimetype(rs.getString("mimetype"));
//	ai.setPhysicalFilename(rs.getString("physical_filename"));
//	ai.setRealFilename(rs.getString("real_filename"));
//	ai.setUploadTime(new Date(rs.getTimestamp("upload_time").getTime()));
//	ai.setExtension(this.selectExtension(rs.getInt("extension_id")));
//
//	a.setInfo(ai);
//
//	return a;
//}
//
///**
// * @see net.jforum.dao.AttachmentDAO#selectAttachmentById(int)
// */
//public Attachment selectAttachmentById(int attachId)
//{
//	ResultSet rs = null;
//	PreparedStatement p = null;
//	try {
//		Attachment e = null;
//
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.selectAttachmentById"));
//		p.setInt(1, attachId);
//
//		rs = p.executeQuery();
//		if (rs.next()) {
//			e = this.getAttachment(rs);
//		}
//
//		return e;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}
//
//public boolean isPhysicalDownloadMode(int extensionGroupId)
//{
//	boolean result = true;
//
//	PreparedStatement p = null;
//	ResultSet rs = null;
//	try {
//		p = JForumExecutionContext.getConnection().prepareStatement(
//				SystemGlobals.getSql("AttachmentModel.isPhysicalDownloadMode"));
//
//		p.setInt(1, extensionGroupId);
//
//		rs = p.executeQuery();
//		if (rs.next()) {
//			result = (rs.getInt("download_mode") == 2);
//		}
//
//		return result;
//	}
//	catch (SQLException e) {
//		throw new DatabaseException(e);
//	}
//	finally {
//		DbUtils.close(rs, p);
//	}
//}