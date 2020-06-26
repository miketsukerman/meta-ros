# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Zstd compression vendor package, providing a dependency for Zstd."
AUTHOR = "ROS Tooling Working Group <ros-tooling@googlegroups.com>"
HOMEPAGE = "https://facebook.github.io/zstd/"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "rosbag2"
ROS_BPN = "zstd_vendor"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libzstd-dev} \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libzstd-dev} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libzstd-dev} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/foxy/zstd_vendor/0.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/zstd_vendor"
SRC_URI = "git://github.com/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=https"
SRCREV = "31d1230b5bbbe3ff2b7606c16b3dd20b5e572506"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}